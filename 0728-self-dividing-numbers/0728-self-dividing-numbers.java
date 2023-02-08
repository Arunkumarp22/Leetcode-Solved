class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<=9){
                res.add(i);
                continue;
            }
            
            if(check(i)){
                res.add(i);
            }
        }
        return res;
        
    }
    
    public boolean check(int num){
        String s=String.valueOf(num);
        for(char ch:s.toCharArray()){
            if(ch=='0') return false;
            if(num%(ch-'0')!=0){
                return false;
            }
        }
        
        return true;
    }
}