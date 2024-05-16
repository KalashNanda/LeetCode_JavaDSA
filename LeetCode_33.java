package LeetCode;
class SearchinRotatedSortedArray {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0 , hi = n-1;

        // find pivot
        while(lo<=hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target)  return mid;
            else if (arr[mid] <= arr[hi]) {
                if(arr[mid]<target && target<=arr[hi] ) lo = mid + 1;
                else hi = mid - 1;
            }
            else {
                if (arr[lo]<=target && target<arr[mid]) hi = mid - 1;
                else lo = mid + 1;
            }
        }
        return -1;
    }
}
public class LeetCode_33 {
}
