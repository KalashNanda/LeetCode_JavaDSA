package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if(x<arr[0]){
            for(int i=0;i<k;i++){
                ans.add(arr[i]);
            }
            return ans;
        }
        if(x>arr[n-1]){
            for(int i=n-1;i>=n-k;i--){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }
        int lo = 0 , hi = n-1;
        int lb = n;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=x){
                lb = mid;
                hi = mid - 1;
            }
            else lo = mid+1;
        }
        int j = lb , i = lb - 1;
        while(k>0 && i>=0 && j<n){
            int di = Math.abs(x-arr[i]);
            int dj = Math.abs(x-arr[j]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
            }
            else{
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while(i<0 && k>0){
            ans.add(arr[j]);
            j++;
            k--;
        }
        while(j==n && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}
public class LeetCode_658 {
}
