class Solution {
    public int totalFruit(int[] fruits) {
        int lastfruit=-1;
        int secondlastfruit=-1;
        int lastfruitcount=0;
        int max=0;
        int res=0;
        for(Integer fruit:fruits){
            if(fruit==lastfruit||fruit==secondlastfruit){
                max+=1;
            }else{
               max=lastfruitcount+1; 
            }
            
            if(fruit==lastfruit){
                lastfruitcount+=1;
            }else{
                lastfruitcount=1;
            }
            
            if(fruit!=lastfruit){
                secondlastfruit=lastfruit;
                lastfruit=fruit;
            }
            
            res=Math.max(max,res);
        }
        return res;
        
    }
}