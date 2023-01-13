class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        if(low%2==0){
           count=0;
            low=low+1;
            while(low<=high){
                count++;
                low+=2;
            }
        }else{
           count=1;
            low=low+2;
            while(low<=high){
                count++;
                low+=2;
            }
        }
        
        return count;
    }
}