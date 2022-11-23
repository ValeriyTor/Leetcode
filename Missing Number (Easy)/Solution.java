class Solution {
    public int missingNumber(int[] nums) {
                int n = nums.length;
        for (int i = 0; i <= n; i++)
        {
            if(i == n)
            {
                return i;
            }
            for (int j = 0; j <= n; j++)
            {
                if(j == n)
                {
                    return i;
                }
                if(i == nums[j])
                {
                    break;
                }

            }

        }
        return 0;
    }
}