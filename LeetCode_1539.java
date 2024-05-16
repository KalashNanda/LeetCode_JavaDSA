package LeetCode;
class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int miss = arr[mid] - (mid+1);
            if(miss<k) lo = mid + 1;
            else hi = mid - 1;
        }
        int kth = k + hi + 1;
        return kth;
    }
}
public class LeetCode_1539 {
}
