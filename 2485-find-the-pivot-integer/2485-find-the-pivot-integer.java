class Solution {
    public int pivotInteger(int n) {
        double res=Math.sqrt(n*(n+1)/2);
        if(res%1==0) return (int) res;
        else return -1;
    }
}