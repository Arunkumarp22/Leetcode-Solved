class Solution {
    public int climbStairs(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        
        int a=0,b=1,c=2;
        for(int i=2;i<n;i++){
            a=b+c;
            b=c;
            c=a;
        }
        
        return a;
    }
}