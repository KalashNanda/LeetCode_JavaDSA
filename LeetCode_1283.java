package LeetCode;
class FindtheSmallestDivisorGivenaThreshold {
    public boolean isLess(int mid, int[] arr, int t){
        int sum = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]%mid==0) sum += arr[j]/mid;
            else sum += arr[j]/mid + 1;
        }
        if(sum<=t) return true;
        else return false;
    }
    public int smallestDivisor(int[] arr, int t) {
        int n = arr.length;
        int x = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            x = Math.max(x,arr[i]);
        }
        int d = 1;
        int lo = 1 , hi = x;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isLess(mid,arr,t)){
                d = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return d;
    }
}
public class LeetCode_1283 {
}
