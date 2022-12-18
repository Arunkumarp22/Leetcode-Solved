class Solution {
    public void nextPermutation(int[] nums) {
       int deci=-1;
        int grei=-1;
        int len=nums.length;
        for(int i=len-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                
                deci=i;
                break;
            }
        }
        if(deci==-1){
            int i=0;
            int j=len-1;
            while(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }else{
        
        
        for(int i=len-1;i>=0;i--){
            if(nums[i]>nums[deci]){
                grei=i;
                break;
            }
        }
        //swap(nums,deci,grei);
            int temp=nums[deci];
            nums[deci]=nums[grei];
            nums[grei]=temp;
        
        //reverse(nums,deci+1,len-1);
           int i=deci+1,j=len-1;
            while(i<j){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;j--;
            }
        }
        
    }
    
    
}