class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        while(i < nums.length){
            res[i] = nums[i] * nums[i];
            i++;
        }
        Arrays.sort(res);
        return res;
    }
}