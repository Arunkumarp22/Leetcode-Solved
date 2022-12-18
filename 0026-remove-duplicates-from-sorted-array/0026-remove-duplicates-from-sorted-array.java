class Solution {
    public int removeDuplicates(int[] nums) {

        Set<Integer> dup=new HashSet<>();
    int ind=0;
        for(int i=0;i<nums.length;i++){
            if(dup.add(nums[i])){
                nums[ind++]=nums[i];
            }
        }

        return ind;
    }
}