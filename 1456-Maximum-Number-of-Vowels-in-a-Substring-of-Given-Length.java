class Solution {
    public int maxVowels(String s, int k) {
        int maxVowel = 0;
        int currVowel = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < k) {
                if (isVowel(s.charAt(i))) {
                    currVowel++;
                } 
                }else {
                    if (isVowel(s.charAt(i))) {
                        currVowel++;
                    }
                    if (isVowel(s.charAt(i - k))) {
                        currVowel--;
                    }
                }
                if (i >= k - 1) {
                    maxVowel = Math.max(maxVowel, currVowel);
                }
            }
        return maxVowel;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}