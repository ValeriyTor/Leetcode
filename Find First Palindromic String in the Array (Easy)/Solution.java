class Solution {
    public String firstPalindrome(String[] words) {
        StringBuilder wordsBuilder = new StringBuilder();
        StringBuilder wordsBuilderReverse = new StringBuilder();
        for(int i = 0; i < words.length; i++)
        {
            wordsBuilder = wordsBuilder.append(words[i]);
            wordsBuilderReverse = wordsBuilder.reverse();
            if(words[i].equals(wordsBuilderReverse.toString())){
                return words[i];
            }
            else {
                wordsBuilder = wordsBuilder.delete(0,wordsBuilder.length());
            }
        }
        return "";
    }
}