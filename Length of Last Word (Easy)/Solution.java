class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int i = len-1;
        int result = 0;
        while (s.charAt(i) == ' ')
        {
            i--;
        }
        while (i >= 0)
        {
            if(s.charAt(i) == ' ')
                return result;
            result++;
            i--;
        }
        return result;
    }
}