class Solution {
    public int[] solution(int[] num_list, int n) {
        int arrSize = num_list.length - n + 1;
        
        int[] answer = new int[arrSize];
        
        for (int i = n - 1; i < num_list.length; i++) {
            answer[i + 1 - n ] = num_list[i];
        }
        
        return answer;
    }
}