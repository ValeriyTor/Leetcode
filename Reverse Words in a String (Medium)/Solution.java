class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int len = s.length();
        ArrayList<Character> word = new ArrayList<>();
        StringBuilder tmp = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < len; i++)
        {
            while (s.charAt(len-1-i) != ' ')
            {
                //System.out.println(s.charAt(len-1-i));
                word.add(s.charAt(len-1-i));
                if(i == len-1) break;
                i++;
            }
            //
            for(int j = 0 ; j < word.size(); j++)
            {
                result.append(word.get(word.size()-1-j)); 
            }
            word.clear();
            if(i == len-1) break;
            while (s.charAt(len-1-i) == ' ')
            {
                i++;
            }
            result.append(' '); //result = result + " ";
            //if(i == len-1) break;
            i--;
        }
        return String.valueOf(result);
    }
}