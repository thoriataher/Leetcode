class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        // map to store if the number checked or not
        Map<Integer, Boolean> checkedMap = new HashMap<>(); 
        //populeate the Map
        for(int num : nums){
            checkedMap.put(num, Boolean.FALSE);
        }
        
        for(int num : nums){
            int currentLength = 1;

            //Check in forward direction
            int nextNum = num + 1;
            while(checkedMap.containsKey(nextNum) && checkedMap.get(nextNum) == false){
                currentLength++;
                checkedMap.put(nextNum, Boolean.TRUE);
                nextNum++;
            }

            //check in reverse direction
            int prevNum = num - 1;
            while(checkedMap.containsKey(prevNum) && !checkedMap.get(prevNum)){
                currentLength++;
                checkedMap.put(prevNum, Boolean.TRUE);
                prevNum--;
            }
         longestLength = Math.max(longestLength, currentLength);
        }
    return longestLength;
    }
}