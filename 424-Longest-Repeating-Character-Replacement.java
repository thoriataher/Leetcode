import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int windowSize = 0;
        int windowStart = 0;
        int maxLength = 0;
        int maxRepeatCharCount = 0;

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char c = s.charAt(windowEnd);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxRepeatCharCount = Math.max(maxRepeatCharCount, map.get(c));

            windowSize = windowEnd - windowStart + 1;
            //windoSize - maxRepeatingCount -> the non repeating characters
            //and if greater than k I have to slide the window
            if (windowSize - maxRepeatCharCount > k) {
                char leftChar = s.charAt(windowStart);
                map.put(leftChar, map.get(leftChar) - 1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
