class Solution {
    public int triangularSum(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
        List<Integer> iRow = new ArrayList<>();
        for(int j = 0; j < nums.length; j++) {
            iRow.add(nums[j]);
        }
        result.add(iRow);
        System.out.println(iRow);
//        System.out.println(result.get(0));
        int len = iRow.size();
        if(nums.length > 1){
            for(int i = 1; i <= nums.length-1; i++){
                iRow = new ArrayList<>();
                for(int j = 0; j < len - 1; j++) {
//                System.out.println(result.get(i-1));
//                System.out.println(result.get(i-1).get(j+1));
//                System.out.println(result.get(i-1).get(j));
                    int elemRiNj = (result.get(i-1).get(j+1) + result.get(i-1).get(j))%10;

                    iRow.add(elemRiNj);
//                System.out.println(iRow);
                }
                result.add(iRow);
                len = iRow.size();
            }

            return result.get(result.size()-1).get(0);
        }
        else{
            return nums[0]%10;
        }
        
    }
}