class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] spaceleft=new int[rocks.length];
        for(int i=0;i<capacity.length;i++){
            spaceleft[i]=capacity[i]-rocks[i];
        }
        
        Arrays.sort(spaceleft);
        int total=0;
        for(int i=0;i<spaceleft.length;i++){
            if(total+spaceleft[i]<=additionalRocks){
                total+=spaceleft[i];
            }else{
                return i;
            }
        }
        
        return spaceleft.length;
    }
}