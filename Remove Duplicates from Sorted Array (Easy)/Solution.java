class Solution {
    public int removeDuplicates(int[] nums) {
       int len = nums.length;
        ArrayList<Integer> arrayList = new ArrayList<>(len);
        for(int i = 0; i < len; i++)
        {
            int c = nums[i];
            while (c == nums[i])
            {
                if(i == len-1)
                {
                    i++;
                    break;
                }
                i++;
            }
            arrayList.add(c);
            i--;
        }
        int size = arrayList.size();
        for(int i=0; i<size;i++)
        {
            nums[i]=arrayList.get(i);
        }
        for(int i=size; i<len;i++)
        {
            nums[i]=0;
        }        
        return arrayList.size();
    }
}