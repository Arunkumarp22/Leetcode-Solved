class Solution {
    public int[] shuffle(int[] nums, int n) {
        int fh=0;
        int sh=fh+n;
        //System.out.print(sh);
        int[] res=new int[2*n];
        for(int i=0;i<2*n;i+=2){
           res[i]=nums[fh++];
            res[i+1]=nums[sh++];
        }
        
        return res;
    }
}