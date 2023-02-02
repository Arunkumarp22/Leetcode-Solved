class Solution {
    int[] alienorder;
    
    public boolean isAlienSorted(String[] words, String order) {
        alienorder=new int[26];
        for(int i=0;i<order.length();i++){
            alienorder[order.charAt(i)-'a']=i;
        }
        
        for(int i=1;i<words.length;i++){
            if(compare(words[i-1],words[i])>0) return false;
        }
        
        return true;
    }
    
    public int compare(String w1,String w2){
        int i=0,j=0;
        int diff=0;
        
        while(i<w1.length()&&j<w2.length()&&diff==0){
            diff=alienorder[w1.charAt(i)-'a']-alienorder[w2.charAt(j)-'a'];
            i++;j++;
        }
        
        if(diff==0){
            return w1.length()-w2.length();
        }
        else{
            return diff;
        }
    }
}