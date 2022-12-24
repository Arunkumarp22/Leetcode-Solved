class Solution {
    public String defangIPaddr(String address) {
        String res="";
        for(char c:address.toCharArray()){
            if(c=='.'){
                res+="[.]";
            }else{
                res+=c;
            }
            System.out.print(c);
        }
        
        return res;
    }
}