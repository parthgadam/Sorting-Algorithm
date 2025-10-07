import java.util.Arrays;

public class MergeTwoSortedArray {

    public static int[] mergeSortedArray(int arr1[], int arr2[]){

        // find the length of each array
        int n = arr1.length;
        int m = arr2.length;

        //initialize pointer
        int i = 0;
        int j=0;
        int k=0;
        int res[] = new int[n+m];

        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                res[k] = arr1[i];
                i++;
                k++;
            }else{
                res[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<n){
            res[k] = arr1[i];
            i++;
            k++;
        }

        while(j<m){
            res[k] = arr2[j];
            j++;
            k++;
        }
        return res;
    }

    public static void main(String args[]){
        int arr1[] = {10,20,30,40};
        int arr2[] = {5,15,25,27};
        int res[] = mergeSortedArray(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }
}
