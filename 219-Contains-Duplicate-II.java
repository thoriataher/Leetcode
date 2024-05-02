class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            if (map.containsKey(nums[windowEnd]) && windowEnd - map.get(nums[windowEnd]) <= k) {
                return true;
            }
            map.put(nums[windowEnd], windowEnd);
        }
        return false;
    }
}
