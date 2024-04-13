class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int longestLength = 1;
        int currentLength = 1;

        for(int i =1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                if(nums[i] == nums[i - 1] + 1){
                    currentLength++;
                }else{
                    longestLength = Math.max(longestLength, currentLength);
                    currentLength = 1;
                }
                longestLength = Math.max(longestLength, currentLength);
            }
        }
        return longestLength;
    }
}