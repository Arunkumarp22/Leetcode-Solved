class Solution {
    int binarySearchLower(int[] nums, int currValue, int startIndex, int lower, int upper) {
        int endIndex = nums.length;

        while (startIndex < endIndex) {
            int mid = startIndex + (endIndex-startIndex)/2;

            if (nums[mid] >= (lower-currValue)) {
                endIndex = mid;
            } else {
                startIndex = mid+1;
            }
        }

        return startIndex;
    }

    int binarySearchUpper(int[] nums, int currValue, int startIndex, int lower, int upper) {
        int endIndex = nums.length;

        while (startIndex < endIndex) {
            int mid = startIndex + (endIndex-startIndex)/2;

            if (nums[mid] <= (upper-currValue)) {
                startIndex = mid+1;
            } else {
                endIndex = mid;
            }
        }

        return startIndex;
    }

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long result = 0;

        for (int i = 0; i < nums.length; i++) {
            int lowerBound = binarySearchLower(nums, nums[i], i+1, lower, upper);
            int upperBound = binarySearchUpper(nums, nums[i], i+1, lower, upper);

            result += (upperBound - lowerBound);
        }

        return result;
    }
}