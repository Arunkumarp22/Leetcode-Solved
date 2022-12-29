class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            nums[i]=a*a;
        }
        Arrays.sort(nums);
        return nums;
    }
}