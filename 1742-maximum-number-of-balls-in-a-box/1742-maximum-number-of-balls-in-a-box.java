class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int a=i,sum=0;
            while(a>0){
                sum+=a%10;
                a/=10;
            }
            
            if(!map.containsKey(sum)){
                map.put(sum,1);
            }else{
                map.put(sum,map.get(sum)+1);
            }
        }
        int max=0;
        for (int k:map.keySet()) {
 
            max=Math.max(max,map.get(k));
        }
        return max;
    }
}