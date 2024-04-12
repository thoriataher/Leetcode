class Solution {
    public int[] productExceptSelf(int[] nums) {
      //Using suffix and prefix to guranteed to fit in a 32-bit 
      //Multiply numbers of array from the left 
      //Multiply numbers of array from the right

      int n = nums.length;
      int[] left = new int[n];
      int[] right = new int[n];

      //populate the left&right arrays --
       left[0] = 1;
      for(int i =1; i < n; i++){
        left[i] = left[i -1] * nums[i - 1];
      }

       right[n - 1] = 1;
      for(int i = n - 2; i > -1; i--){
        right[i] = right[i + 1] * nums[i + 1];
      }

      int[] result = new int[n];
      for(int i =0; i < n; i++){
        result[i] = left[i] * right[i];
      }
      return result;
    }
}