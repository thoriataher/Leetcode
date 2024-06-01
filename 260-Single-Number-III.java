class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int[] res = new int[2];

        // Count the frequency of each number
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find the distinct numbers
        int index = 0;
        for (int num : freq.keySet()) {
            if (freq.get(num) == 1)
                res[index++] = num;
        }

        return res;
    }
}
