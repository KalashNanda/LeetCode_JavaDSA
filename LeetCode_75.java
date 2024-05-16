package LeetCode;
class SortColors {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int mid = 0, hi = n-1, lo = 0;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                mid++;
                lo++;
            }
            else if (arr[mid]==1) mid++;
            else{  // arr[mid] = 2
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
    }
}
public class LeetCode_75 {
}
