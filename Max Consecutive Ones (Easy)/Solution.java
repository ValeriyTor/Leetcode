class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int result = 0;
        int count = 0;
        for(int i = 0; i < len; i++)
        {
            while (nums[i] == 1)
            {
                count++;
                if(i == len-1) break;
                i++;
            }
            if(result < count)
                result = count;
            count = 0;
            if(i == len-1) break;
        }
        return result; 
    }
}