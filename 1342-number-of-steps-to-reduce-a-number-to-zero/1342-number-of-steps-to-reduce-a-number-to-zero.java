class Solution {
    public int numberOfSteps(int num) {
        /*int count=0;
        while(num!=0){
            if(num%2==0){
                num/=2;
            }else{
                num-=1;
            }
            count++;
        }*/
        return Integer.toBinaryString(num).length() - 1 + Integer.bitCount(num);

        //return count;
    }
}