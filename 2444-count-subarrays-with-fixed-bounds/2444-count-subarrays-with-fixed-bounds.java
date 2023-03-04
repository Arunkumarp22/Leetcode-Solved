class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0, bad = -1, min = -1, max = -1, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] < minK || nums[i] > maxK) bad = i;
            if (nums[i] == minK) min = i;
            if (nums[i] == maxK) max = i;
            res += Math.max(0L, Math.min(min, max) - bad);
        }
        return res;
    }
}