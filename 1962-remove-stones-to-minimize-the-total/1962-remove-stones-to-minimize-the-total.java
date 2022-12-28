class Solution {
    public int minStoneSum(int[] piles, int k) {
        Queue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());

        for(int a:piles){
            q.add(a);
        }

        while(k-->0){
            int a=q.poll();
            int d=a/2;
            q.add(a-d);
        }

        int res=0;
        while(q.size()>0){
            res+=q.poll();
        }

        return res;
    }
}