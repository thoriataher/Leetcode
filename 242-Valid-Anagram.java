class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
            
        char[] word1 = s.toCharArray();
        char[] word2 = t.toCharArray();
        int n = word1.length;

        Arrays.sort(word1);
        Arrays.sort(word2);

        for(int i=0; i< n; i++){
                if(word1[i] != word2[i])
                return false;
        }
        return true;
        
    }
}