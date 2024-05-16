package LeetCode;
class RotateArray {
    public static void reverse(int[] nums,int i,int j) {
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
}
public class LeetCode_189 {
}
