class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int hash1[]=new int[101];
        int hash2[]=new int[101];
        int hash3[]=new int[101];
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            hash1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            hash2[nums2[i]]++;
        }
        for(int i=0;i<nums3.length;i++){
            hash3[nums3[i]]++;
        }
        
        
        for(int i=0;i<=100;i++){
            if((hash1[i]>0&&hash2[i]>0)||(hash1[i]>0&&hash3[i]>0)||(hash2[i]>0&&hash3[i]>0)){
                li.add(i);
            }
        }
        
        return li;
    }
}