class Solution {
    public int mySqrt(int x) {
	if(x == 0) return 0;
    	if(x == 1) return 1;
    	double t = 0;     
    	double squareRoot = x / 2;     
    	while ((t - squareRoot) != 0) {
        	t = squareRoot;
        	squareRoot = (t + (x / t)) / 2;
    		} 
    	return (int)squareRoot;
	}
}