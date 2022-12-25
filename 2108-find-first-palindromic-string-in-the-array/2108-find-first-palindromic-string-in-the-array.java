class Solution {
    public String firstPalindrome(String[] words) {
        for(String d:words){
            StringBuilder st=new StringBuilder(d);
            if(st.reverse().toString().equals(d)){
                return d;
            }
        }
        
        return "";
    }
}