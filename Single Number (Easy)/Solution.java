class Solution {
    public int singleNumber(int[] nums) {
       int len = nums.length;
        ArrayList<Integer> arrayList = new ArrayList<>(len);

        for (int i=0; i<len; i++)
        {
            arrayList.add(nums[i]);
        }
        for (int i=0; i<len; i++)
        {
            if(arrayList.get(i)==null)
            {
                continue;
            }
            if(i==len-1)
            {
                return nums[i];
            }
            for (int j = i+1; j <= len; j++)
            {
                if(j == len)
                {
                    return nums[i];
                }
                if(arrayList.get(j)==null)
                {
                    continue;
                }

                if(arrayList.get(i).equals(arrayList.get(j)))
                {
                    arrayList.set(i, null);
                    arrayList.set(j, null);
                    break;
                }
            }
        }
        return 0;
    }
}