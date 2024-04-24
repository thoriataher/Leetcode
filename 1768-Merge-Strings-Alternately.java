class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();

        int start = 0;

        while (start < word1.length() || start < word2.length()) {
            if (start < word1.length()) {
                result.append(word1.charAt(start));
            }
            if (start < word2.length()) {
                result.append(word2.charAt(start));
            }
            start++;
        }

        return result.toString();
    }
}