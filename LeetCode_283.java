package LeetCode;

import java.util.ArrayList;

class  MoveZeroes {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList();
        int noz = 0;
        for(int ele:nums){
            if(ele!=0) arr.add(ele);
            else noz++;
        }
        for(int i=1;i<=noz;i++){
            arr.add(0);
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = arr.get(i);
        }
    }
}
public class LeetCode_283 {
}
