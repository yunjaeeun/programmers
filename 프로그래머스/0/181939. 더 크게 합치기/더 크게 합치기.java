class Solution {
    public int solution(int a, int b) {
        String ab = a + "" + b;
        String ba = b + "" + a;
        
        int abNum = Integer.parseInt(ab);
        int baNum = Integer.parseInt(ba);
        
        int answer = 0;
        
        if(abNum > baNum) {
            answer = abNum;
        } else {
            answer = baNum;
        }
         
        return answer;
    }
}