class Solution {
    public int maxPoints(int[][] points) {
        int n=points.length;
        if(n==1)
            return 1;
        int result=0;
        HashMap<Double,Integer> hs=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j!=i){
                    double slope=Math.atan2(points[j][1]-points[i][1],points[j][0]-points[i][0]);
                    hs.put(slope,hs.getOrDefault(slope,0)+1);
                }
            }
            result=Math.max(result,Collections.max(hs.values()));
            hs.clear();
        }
        return result+1;
    }
}