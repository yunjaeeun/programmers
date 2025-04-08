class Solution {
    public int[] solution(int[] num_list) {
        quickSort(num_list, 0, num_list.length - 1);
        int[] arr = new int[num_list.length - 5];
        
        for (int i = 5; i < num_list.length; i++) {
            arr[i - 5] = num_list[i];
        }
        return arr;
    }
    
    public void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pi = partition(arr, left, right);
        quickSort(arr, left, pi - 1);
        quickSort(arr, pi + 1, right);
        
    }
    
    public int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo];
        int i = lo;
        int j = hi;
        
        while(i < j) {
            while(pivot < arr[j]) {
                j--;
            }
            while(i < j && pivot >= arr[i]) {
                i++;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[lo] = arr[i];
        arr[i] = pivot;
        
        return i;
    }
}