class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map <Integer, Integer> numMap = new HashMap<>();

        //Build the hash table
        for(int i=0; i < nums.length; i++){
            numMap.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            //if the complement exist as a key and it's value (index) not equal i
            if(numMap.containsKey(complement) && numMap.get(complement) != i){
                return new int[]{i, numMap.get(complement)};
            }
        }
        return new int[0];
    }
}
