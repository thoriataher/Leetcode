class Solution {
    public boolean isPalindrome(String s) {
        char[] strs = s.toLowerCase().toCharArray();
        if (s.isEmpty())
            return false;
        int start = 0;
        int end = strs.length - 1;

        while (start <= end) {
            if (!Character.isLetterOrDigit(strs[start])) {
                start++;
            } else if (!Character.isLetterOrDigit(strs[end])) {
                end--;
            }else {
                if (strs[start] != strs[end]) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;

    }
}