class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        int left=0,right=nums.length-1;
        
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                res[0]=left+1;
                res[1]=right+1;
                break;
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        
        return res;
    }
}