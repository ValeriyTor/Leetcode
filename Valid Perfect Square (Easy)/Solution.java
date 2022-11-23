class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0) return true;
        if(num == 1) return true;
        double t = 0;     
        double squareRoot = num / 2;     
        while ((t - squareRoot) != 0) {
            t = squareRoot;
            squareRoot = (t + (num / t)) / 2;
            }
        if(num == (int)squareRoot * (int)squareRoot) return true;
        else return false;
        
    }
}