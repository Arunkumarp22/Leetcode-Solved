class Solution {
    public int longestSubsequence(int[] arr, int difference) {
         Map<Integer,Integer> hash=new HashMap<>();
        int res=1;
        for(int i:arr){
           int prev=hash.getOrDefault(i-difference,0);
            hash.put(i,prev+1);
            res=Math.max(res,prev+1);
        }
        
        return res;
    }
}