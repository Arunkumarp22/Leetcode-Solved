class Solution {
    public int strStr(String haystack, String needle) {
        char[] hay=haystack.toCharArray();
        char[] nee=needle.toCharArray();
        int i=0,j=0;
        while(i<hay.length){
            int h=i;j=0;
            while(h<hay.length&&j<nee.length&&hay[h]==nee[j]){
                h++;
                j++;
            }
            
            if(j==nee.length){
                return i;
            }
            i++;
        }
        
        return -1;
    }
}