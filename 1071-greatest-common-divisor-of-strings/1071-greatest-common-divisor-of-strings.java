class Solution {
    public String gcd(String s1, String s2){
        if(s1.length() < s2.length()){
            return gcd(s2,s1);
        }
        else if(!s1.startsWith(s2)){
            return "";
        }
        else if(s2.isEmpty()){
            return s1;
        }
        else{
            return gcd(s1.substring(s2.length()), s2);
        }
    }
    public String gcdOfStrings(String str1, String str2) {
        return gcd(str1,str2);
    }
}