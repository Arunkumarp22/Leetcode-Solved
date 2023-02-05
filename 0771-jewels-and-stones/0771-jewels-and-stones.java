class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] hash=new int[128];
        for(char ch:jewels.toCharArray()){
            hash[ch]++;
        }
        int count=0;
        for(char ch:stones.toCharArray()){
            if(hash[ch]>0){
                count++;
            }
        }
        
        return count;
    }
}