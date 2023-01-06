class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i=0;
        int res=0;
        
        while(i<costs.length&&costs[i]<=coins){
            coins-=costs[i];
            res++;
            i++;
        }
        
        return res;
    }
}