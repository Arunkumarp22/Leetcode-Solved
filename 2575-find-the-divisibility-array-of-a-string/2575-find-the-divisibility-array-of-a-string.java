import java.math.BigInteger;
class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] res=new int[word.length()];
     
        long n=0;
       
        int index=0;
        for(int i=0;i<word.length();i++){
            int dec=word.charAt(i)-'0';
            n=n*10;
            n=n+dec;
            n=n%m;
            if(n==0){
                res[index++]=1;
            }else{
                res[index++]=0;
            }
            
            
        }
        
        return res;
    }
}