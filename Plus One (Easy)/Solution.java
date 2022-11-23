class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        digits[len-1] = digits[len-1] + 1;
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        resultList.add(0);
        for(int j = 0; j < len; j++ )
        {
            resultList.add(digits[j]);
        }
        int i = 0;
        while(resultList.get(resultList.size()-1-i) >= 10){
            resultList.set(resultList.size() - 1 - i, resultList.get(resultList.size() - 1 - i) % 10);
            i++;
            resultList.set(resultList.size() - 1 - i, resultList.get(resultList.size() - 1 - i) + 1);
        }
        if (resultList.get(0) == 0) resultList.remove(0);
        int[] arr = new int[resultList.size()];
        for (i = 0; i < resultList.size(); i++) {
            arr[i] = (int)resultList.get(i);
        }
        return arr;

    }
}