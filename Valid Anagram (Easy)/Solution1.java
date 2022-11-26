class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
        {
            return false;
        }
        StringBuilder s1 = new StringBuilder(s);
        //System.out.println(s1);
        StringBuilder t1 = new StringBuilder(t);
        //System.out.println(t1);
        //StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < s1.length(); i++)
        {
            for(int j = 0 ; j < t1.length(); j++){
                if(s1.charAt(i) == t1.charAt(j))
                {
                    //res.append(t1.charAt(j));
                    t1.deleteCharAt(j);
                    break;
                }
            }
        }
        //System.out.println(res);
        return t1.isEmpty();
    }
}