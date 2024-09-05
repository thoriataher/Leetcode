class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }
    // As I have sorted Array -> So I'll use \Binary Search\
    // Apply two Binary Search one to find the First
    // And one to find the Last
    // Time Complexity --> O(logn)

    // The first Binary search to find First Position
    private int findFirst(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;
        int first = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return first;
    }

    // to find the last position
    private int findLast(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        int last = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                last = mid;
                st = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return last;
    }
}