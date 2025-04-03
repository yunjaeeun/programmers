class Solution {
    public int solution(int a, int b) {
        String ab = a + "" + b;
        int numAb = Integer.parseInt(ab);
        int abGob = 2 * a * b;
        
        if (numAb < abGob) {
            return abGob;
        }
        
        return numAb;
    }
}