class Solution {
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        max1 = nums[0];
        int len = nums.length;
        for (int i = 1; i < len; i++)
        {
            if(nums[i] > max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
                continue;
            }
            if(nums[i] == max1) continue;
            if(max2 == null || nums[i] > max2)
            {
                max3 = max2;
                max2 = nums[i];
                continue;
            }
            if(nums[i] == max2) continue;
            if(max3 == null || nums[i] > max3)
            {
                max3 = nums[i];
                continue;
            }
        }
        if(max3 == null) return max1;
        else return max3;
    }
}