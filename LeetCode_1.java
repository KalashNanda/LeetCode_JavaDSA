package LeetCode;
class TwoSum {
    public int[] twoSum(int[] arr, int x) {
        int[] ans = new int[2];
        int n = arr.length;
        // solution
        for(int i=0;i<n;i++){
            boolean flag = false;   // optimization
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    ans[0] = i;
                    ans[1] = j;
                    flag = true;    // optimization
                    break;          // optimization
                }
            }
            if(flag==true)   break;  // optimization
        }
        return ans;
    }
}
public class LeetCode_1 {
}
