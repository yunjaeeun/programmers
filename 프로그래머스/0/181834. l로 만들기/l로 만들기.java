class Solution {
    public String solution(String myString) {
        char l = 'l';
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) < l) {
                answer = answer + "l";
            } else {
                answer = answer + String.valueOf(myString.charAt(i));
            }
        }
        
        return answer;
    }
}