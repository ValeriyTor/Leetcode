class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> numsSet = new TreeSet<>();
        for(int i=0;i<nums.length;i++) {
            numsSet.add(nums[i]);
        }
        List<Integer> numsList = new ArrayList<>(numsSet);
        if(numsList.size()>=3) return numsList.get(numsList.size()-3);
        return numsList.get(numsList.size()-1);
    }
}