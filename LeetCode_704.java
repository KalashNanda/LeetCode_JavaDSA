package LeetCode;
class BinarySearch {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0 , hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]>target)  hi = mid-1;
            else if (arr[mid]<target)  lo = mid+1;
        }
        return -1;
    }
}
public class LeetCode_704 {
}
