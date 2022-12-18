class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        for(int i=0;i<nums.length;i++){
            //count=0;
           if(nums[i]==1){
                count++;                
            }
            max=Math.max(count,max);
            if(nums[i]==0) count=0;
        }

        return max;
    }
}