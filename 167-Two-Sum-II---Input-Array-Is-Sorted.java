class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int sum = 0;

        int i = 0, j = numbers.length - 1;
        while (i <= j) {
            sum = numbers[i] + numbers[j];
            if (sum == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }
            if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return res;
    }
}