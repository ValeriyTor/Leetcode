class Solution {
    public int strStr(String haystack, String needle) {
        int lenN = needle.length();
        int lenH = haystack.length();
        for (int i=0; i < lenH-lenN+1; i++)
        {
            if(haystack.charAt(i) == needle.charAt(0))
            {
                if(lenN == 1) return i;
                for(int j = 1; j < lenN; j++)
                {
                    if(haystack.charAt(i+j)!= needle.charAt(j))
                        break;
                    if(j == lenN-1)
                        return i;
                }
            }
        }
        return -1;        
    }
}