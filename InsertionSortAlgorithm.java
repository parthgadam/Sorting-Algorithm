import java.util.Arrays;

public class InsertionSortAlgorithm {

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            for(int j = i; j>0; j--){
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                }

            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
        int arr[] = {6,5,1,4,2,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
