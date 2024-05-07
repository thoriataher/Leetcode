class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // use slidingwindow of size s1.length() => because we should compare string
        // have the same length
        // use a fixed siaze array of 26 to count the freq of each character
        // s2 should be greater than or equal length of s1
        int s1Len = s1.length();
        int s2Len = s2.length();

        if (s2 == null || s1Len > s2Len || s2Len == 0)
            return false;

        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        // create window size of s1Len
        for (int i = 0; i < s1Len; i++) {
            s1Arr[s1.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }
        //Loop over the whole string \s2Len - s1Len\ means the tries I need to find premutation in s2 
        for (int i = 0; i < s2Len - s1Len; i++) {
            if (isPermutation(s1Arr, s2Arr))
                return true;
            // Remove character from ith index
            // and create character at index i+s1Len
            s2Arr[s2.charAt(i) - 'a']--;
            s2Arr[s2.charAt(i + s1Len) - 'a']++;
        }
        if (isPermutation(s1Arr, s2Arr))
            return true;

        return false;
    }

    public boolean isPermutation(int[] s1Arr, int[] s2Arr) {
        for (int i = 0; i < s1Arr.length; i++) {
            if (s1Arr[i] != s2Arr[i])
                return false;
        }
        return true;
    }
}