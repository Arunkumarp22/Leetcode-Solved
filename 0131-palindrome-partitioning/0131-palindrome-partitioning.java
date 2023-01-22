class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List <String> temp=new ArrayList<>();
        partition(0,s,temp,res);
        return res;
    }
    
   private void partition(int index,String s,List<String> temp,List<List<String>> res){
       if(index==s.length()){
           res.add(new ArrayList<>(temp));
       }
       
       for(int i=index;i<s.length();i++){
           if(pali(s,index,i)){
               temp.add(s.substring(index,i+1));
               partition(i+1,s,temp,res);
               temp.remove(temp.size()-1);
           }
       }
   } 
    
    
    private boolean pali(String s,int st,int e){
        while(st<=e){
            if(s.charAt(st++)!=s.charAt(e--)){
                return false;
            }
        }
        return true;
    } 
}