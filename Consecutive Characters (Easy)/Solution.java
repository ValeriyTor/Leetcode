class Solution {
    public int maxPower(String s) {
        int len = s.length();
        int result = 0;
        int count = 0;
        for(int i = 0; i < len; i++)
        {
            char c = s.charAt(i);
            while (c == s.charAt(i))
            {
                count++;
                if(i == len-1) break;
                i++;
            }
            if(result < count)
                result = count;
            count = 0;
            if(i == len-1) break;
            i--;
        }
        return result; 
    }
}