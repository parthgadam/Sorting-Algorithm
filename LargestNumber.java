import java.util.Arrays;

public class LargestNumber {

    public static String largestNumber(int[] arr) {
        String[] nums  = new String[arr.length];

        for(int i = 0; i<arr.length;i++){
            nums[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(nums, (a,b) -> (b+a).compareTo(a+b));
         if(nums[0].equals("0")) return "0";

         StringBuilder sb = new StringBuilder();
         for(String s : nums){
            sb.append(s);
         }
         return sb.toString();
    }
    public static void main(String args[]){
        int[] nums = {3,30,34,5,9};
        String largest = largestNumber(nums);
        System.out.println(largest);
    }
}
