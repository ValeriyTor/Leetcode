class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int division = 0;
        int result = x;
        int result_reverse = 0;
        int i = 0;
        int length = String.valueOf(result).length();
        while (result != 0) {
            division = result % 10;
            result = result / 10;
            result_reverse = (int) (result_reverse + division * Math.pow(10,length-i-1));
            if (result_reverse >= 2147483647) { // max of Integer
                return false;
            }
            i++;
        }
            return (x == result_reverse);
    }
}