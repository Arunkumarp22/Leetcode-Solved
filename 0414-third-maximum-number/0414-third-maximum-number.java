class Solution {
    public int thirdMax(int[] nums) {
        Integer first=null,second=null,third=null;
        for(Integer k:nums){
            if(k.equals(first)||k.equals(second)||k.equals(third)) continue;
            
            if(first==null||k>first){
               third=second;
                second=first;
                first=k;
            }else if(second==null||k>second){
                third=second;
                second=k;
            }else if(third==null||k>third){
                third=k;
            }
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            System.out.println();
            
        }
        
       return third==null?first:third;
    }
}