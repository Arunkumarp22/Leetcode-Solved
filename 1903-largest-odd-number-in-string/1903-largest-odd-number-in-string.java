class Solution {
    public String largestOddNumber(String num) {
        int i=0;
        for(i=num.length()-1;i>=0;i--){
            int a=num.charAt(i)-'0';
            
            if(a%2==1) return num.substring(0,i+1);
            System.out.print(a);
        }
        
        return "";
    }
}