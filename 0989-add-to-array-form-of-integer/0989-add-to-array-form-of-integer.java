class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> li=new ArrayList<>();
        int i=num.length-1;
        int carry=0,sum=0;
        while(i>=0 || k>0){
            int n=0;
            if(i>=0){
                n=num[i];
            }
            sum=n+(k%10)+carry;
            li.add(sum%10);
            carry=sum/10;
            k/=10;
            i--;
        }
        
        if(carry>0){
            li.add(carry);
        }
        
        
        Collections.reverse(li);
        
        return li;
    }
}