class Solution {
    public boolean isPowerOfFour(int n) {
        double stop = Math.pow(n,0.5); 
        for(int i = 0; i < stop; i++)
        {
            if(Math.pow(4,i)==n){
                return true;
            }
        }
        return false;
    }
}