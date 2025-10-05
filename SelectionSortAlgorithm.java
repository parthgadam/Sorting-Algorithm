import java.util.Arrays;

public class SelectionSortAlgorithm {

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            // initialize minIndex
            int minValue = arr[i];
            int minIndex = i;
            //find the minimum element
            for(int j=i; j<n; j++){
                int curr = arr[j];
                if(curr < minValue){
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    public static void swap(int[] arr, int i, int minIndex){
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String args[]){
        int arr[] = {6,5,1,4,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
