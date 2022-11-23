class Solution {
    public boolean checkZeroOnes(String s) {
               int len = s.length();
        int result0 = 0;
        int result1 = 0;
        int count0 = 0;
        int count1 = 0;
        for(int i = 0; i < len; i++)
        {
            while (s.charAt(i) == '1')
            {
                count1++;
                if(i == len-1) break;
                i++;
            }
            if(result1 < count1)
                result1 = count1;
            count1 = 0;
            while (s.charAt(i) == '0')
            {
                count0++;
                if(i == len-1) break;
                i++;
            }
            if(result0 < count0)
                result0 = count0;
            count0 = 0;
            if(i == len-1) break;
            i--;
        }
        if(result1 > result0) return true;
        else return false;
    }
}