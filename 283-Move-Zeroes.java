class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = i + 1;

        while (i < nums.length - 1 && j < nums.length) {
            if (nums[i] == 0 && nums[j] == 0) {
                j++;
            } else if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++; // Move i to the next position to avoid redundant swaps
                j++;
            } else { // If nums[i] != 0, move both pointers
                i++;
                j++;
            }
        }
    }
}
