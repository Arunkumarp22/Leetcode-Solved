class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        
        int carry=0,sum=0;
        
        while(i>=0 || j>=0){
            int a=0,b=0;
            if(i>=0){
                a=num1.charAt(i)-'0';
            }
            
            if(j>=0){
                b=num2.charAt(j)-'0';
            }
            
            sum=a+b+carry;
            
            sb.append(sum%10);
            carry=sum/10;
            
            i--;j--;
        }
        
        if(carry>0){
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}