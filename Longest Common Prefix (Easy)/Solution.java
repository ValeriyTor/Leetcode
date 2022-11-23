class Solution {
    public String longestCommonPrefix(String[] strs) {
         int minLen = strs[0].length(); 
        for(int i=1; i < strs.length; i++) {
            if(minLen > strs[i].length()) {
                minLen = strs[i].length();
            }
        }
        StringBuilder prefix = new StringBuilder();
        for(int i=0; i < minLen; i++) {
            char charFromFirstWord = strs[0].charAt(i);
            for(int j=1; j < strs.length; j++ ) {
                char charFromJWord = strs[j].charAt(i);
                if(charFromFirstWord != charFromJWord) {
                    return prefix.toString();
                }
            }
            prefix.append(charFromFirstWord);
        }
        return prefix.toString();
    }
}