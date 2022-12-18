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
            reverse(nums,0,len-1);
        }else{
        
        
        for(int i=len-1;i>=0;i--){
            if(nums[i]>nums[deci]){
                grei=i;
                break;
            }
        }
        swap(nums,deci,grei);
        
        reverse(nums,deci+1,len-1);
        }
        
    }
    
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    private void reverse(int[] num,int i,int j){
        while(i<j) swap(num,i++,j--);
    }
}