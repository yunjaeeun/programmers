class Solution {
    public int solution(int[] num_list) {
        int arrSize = num_list.length;
        
        int answer = 0;
        if (arrSize >= 11) {
            for(int i : num_list) {
                answer += i;
            }
        } else {
            answer += 1;
            for(int i : num_list) {
                answer *= i;
            }
        }
        
        return answer;
    }
}