class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean saw[]=new boolean[rooms.size()];
        saw[0]=true;
        
        Stack<Integer> key=new Stack<>();
        key.add(0);
        while(!key.isEmpty()){
            int curr=key.pop();
            for(int k:rooms.get(curr)){
                if(!saw[k]){
                    saw[k]=true;
                    key.add(k);
                }
                            
            }
        }
        
        
        for(boolean d:saw){
            if(!d) return false;
        }
        
        return true;
    }
}