class Solution {
    public int solution(String myString, String pat) {
        String a = myString.toLowerCase();
        String b = pat.toLowerCase();
        
        int answer = 0;
        
        if (a.contains(b)) {
            answer = 1;
        }
        
        return answer;
    }
}