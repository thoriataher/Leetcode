class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){ 
            int currentWidth = Math.min(height[left], height[right]);
            int currentArea = currentWidth* (right - left);
            maxArea = Math.max(currentArea, maxArea); 
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
