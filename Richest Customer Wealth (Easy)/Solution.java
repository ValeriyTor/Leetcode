class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] arr = new int[accounts.length];
        for (int i=0; i<accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++)
                arr[i] = arr[i] + accounts[i][j];
        }
        int max = arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
}