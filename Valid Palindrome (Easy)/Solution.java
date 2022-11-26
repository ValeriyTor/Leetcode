class Solution {
    public boolean isPalindrome(String s) {
        String[] arrSpecSympol = {" ", ",", ".","!","?",":","@","#","%","$","+","-","=","*","&","_","^","[","]","(",")","{","}","\\","/","'","\"",";","`"};

        s = s.toLowerCase();
        for(int i = 0; i < arrSpecSympol.length; i++)
        {
            s = s.replace(arrSpecSympol[i], "");
        }
        StringBuilder sTmp = new StringBuilder(s);
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            s1 = s1.append(sTmp.charAt(s.length()-1-i));
        }
        String sRvr = "";
        sRvr = s1.toString();
        if(s.equals(sRvr)){
            return true;
        }
        else {
            return false;
        }
    }
    
}