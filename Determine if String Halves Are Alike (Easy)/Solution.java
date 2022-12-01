class Solution {
    public boolean halvesAreAlike(String s) {
        StringBuilder arr = new StringBuilder("aeiou");
        StringBuilder s1 = new StringBuilder(s.toLowerCase());
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < arr.length(); i++)
        {
            for(int j = 0; j < s.length()/2; j++) {
                if( s1.charAt(j) == arr.charAt(i)) {
                    count1++;
                }
                if( s1.charAt(s.length()/2 + j) == arr.charAt(i)) {
                    count2++;
                }
            }
        }
        if (count1 == count2) return true;
        else return false;
    }
}