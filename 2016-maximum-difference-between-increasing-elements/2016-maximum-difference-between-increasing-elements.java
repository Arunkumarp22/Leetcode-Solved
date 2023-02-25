class Solution {
    public int maximumDifference(int[] nums) {
        int diff=-1,min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(min<nums[i]){
               diff=Math.max(diff,nums[i]-min); 
            }
            min=Math.min(min,nums[i]);
        }
        
        return diff;
    }
}