class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int len1 = nums.length-1;
        int len2 = nums.length;
        int num1;
        for(int i = 0; i < len1; i++)
        {
            num1 = nums[i];
            for (int j = i+1; j < len2; j++)
                if((num1 + nums[j]) == target)
                {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
        }
        return result;
    }
}