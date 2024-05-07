class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int windowStart = 0; //pointer to the start of the window
        int windowSize = 0;
        int maxLength= 0;
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char c = s.charAt(windowEnd);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while(map.get(c) > 1){
                char leftChar = s.charAt(windowStart);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                windowStart++;
            }
            windowSize = windowEnd - windowStart + 1;
            maxLength = Math.max(maxLength, windowSize);
    }
    return maxLength;
}
}