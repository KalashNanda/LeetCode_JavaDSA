package LeetCode;
class MinimizedMaximumofProductsDistributedtoAnyStore {
    public boolean isPossible(int[] arr,int maxQ, int n){
        int stores = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%maxQ == 0) stores += arr[i]/maxQ;
            else stores += arr[i]/maxQ + 1;
        }
        if(stores>n) return false;
        else return true;
    }
    public int minimizedMaximum(int n, int[] arr) {
        int m = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            mx = Math.max(mx,arr[i]);
        }
        int lo = 1, hi = mx;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(arr,mid,n)==true) {
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return ans;
    }
}
public class LeetCode_2064 {
}
