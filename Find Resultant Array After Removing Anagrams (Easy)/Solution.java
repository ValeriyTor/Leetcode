class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < words.length; i++){
            list.add(words[i]);
        }
        for(int i = 0 ; i < list.size()-1; i++){
            if(isAnagramR(list.get(i), list.get(i+1))){
                list.remove(i+1);
                i--;
            }
        }
        return list;
    }
    
    
    public boolean isAnagramR(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1); 
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
    }    
}