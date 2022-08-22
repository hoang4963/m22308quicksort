public class Main {
    public static void main(String[] args) {
        int arr[] = {4,6,8,7,5,656,1,165,4465,46,46};
        quickSort(arr,0, arr.length- 1);
        for (int i: arr
             ) {
            System.out.print(i +" ");
        }
    }
    public static void quickSort(int arr[], int begin, int end){
        if (begin < end){
            int partition = Partition(arr, begin, end);
            quickSort( arr, begin, partition - 1);
            quickSort( arr, partition + 1, end);
        }
    }
    private static int Partition(int arr[], int begin, int end){
        int pivot = arr[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }
}
