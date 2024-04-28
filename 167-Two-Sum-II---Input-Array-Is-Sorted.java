class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int [2];

        int i =0;
        int j = numbers.length - 1;
        int sum = 0;

        while(i <= j){
            sum = numbers[i] + numbers[j];
            if(sum == target){
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }
            if(sum > target){
                j--;
            }else{
                i++;
            }
        }
        return res;
    }
}