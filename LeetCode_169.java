package LeetCode;

import java.util.Arrays;

class MajorityElements {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
public class LeetCode_169 {
}
