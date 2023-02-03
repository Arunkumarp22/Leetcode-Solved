class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] temp=new StringBuilder[numRows];
        
        for(int i=0;i<numRows;i++){
            temp[i]=new StringBuilder();
        }
        
        int index=0;
        while(index<s.length()){
            for(int i=0;i<numRows&&index<s.length();i++){
                temp[i].append(s.charAt(index++));
            }
            for(int i=numRows-2;i>0&&index<s.length();i--){
                temp[i].append(s.charAt(index++));
            }
        }
        
        StringBuilder res=temp[0];
        for(int i=1;i<numRows;i++){
            res.append(temp[i].toString());
        }
        
        return res.toString();
    }
}