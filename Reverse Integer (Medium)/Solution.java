class Solution {
    public int reverse(int x) {

        int negative = 0;
        if (x < 0) {
            x = Math.abs(x);
            negative = 1;
        }
        int division = 0;
        int result = 0;
        int i = 0;
        int length = String.valueOf(x).length();
        while (x != 0) {
            division = x % 10;
            x = x / 10;
            result = (int) (result + division * Math.pow(10,length-i-1));
            if (result >= 2147483647 || result <= -2147483648) { // max and min Integer
                return 0;
            }
            i++;
        }
        if (negative == 1)
            return -result;
        else
            return result;
    }
}
