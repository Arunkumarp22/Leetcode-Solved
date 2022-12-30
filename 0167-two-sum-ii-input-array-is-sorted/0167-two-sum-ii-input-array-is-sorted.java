class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        int low=0,high=nums.length-1;
        
        while(low<high){
            int sum=nums[low]+nums[high];
            if(sum==target){
                res[0]=low+1;
                res[1]=high+1;
                break;
            }else if(sum>target){
                high--;
            }else{
                low++;
            }
        }
        
        return res;
    }
}