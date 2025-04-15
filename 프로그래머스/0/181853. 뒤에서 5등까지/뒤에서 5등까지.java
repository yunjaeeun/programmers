class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        
        quickSort(num_list, 0, num_list.length - 1);
        for(int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
    
    public void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        
        int pi = partition(arr, left, right);
        quickSort(arr, left, pi - 1);
        quickSort(arr, pi + 1, right);
    }
    
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // 마지막 원소를 피벗으로 선택
        int i = low - 1;        // 피벗보다 작은 원소의 끝 인덱스

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // arr[i]와 arr[j] 위치 교환
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 피벗 위치 이동
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // 피벗 위치 반환
        return i + 1;
    }
}