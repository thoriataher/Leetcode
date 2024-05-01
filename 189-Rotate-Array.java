class Solution {
    public void rotate(int[] nums, int k) {
        int[] results = new int[nums.length];
        for(int i =0; i < nums.length; i++){
            int index = (i+k) % nums.length;
            results[index] = nums[i];
        }
        for(int i=0; i < nums.length; i++){
            nums[i] = results[i];
        }
      
    }
}