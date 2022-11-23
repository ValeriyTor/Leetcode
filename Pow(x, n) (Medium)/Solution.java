class Solution {
    public double myPow(double x, int n) {
        double result = 1;
        if(x == 1) return 1;
        if(x == -1 && n % 2 == 0) return 1;
        if(x == -1 && n % 2 != 0) return -1;
        if(n > 2147483647 || n <= -2147483648) return 0; // min and max of Integer
        if(n > 0){
            
            for(int i = 1; i <= n; i++)
            {
                if(result < 0.00001 && result > 0) return 0; // 5 number after dot (".")
                result = result * x;
            }
        }
        if(n < 0){
            n = Math.abs(n);
            for(int i = 1; i <= n; i++)
            {
                if(result < 0.00001 ) return 0;
                result = (result / x);
            }
                
        }
        return result;
    }
}