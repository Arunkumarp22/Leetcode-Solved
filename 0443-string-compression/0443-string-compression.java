class Solution {
    public int compress(char[] chars) {
        //System.out.println(chars.length-1);
        
        int k=0;
        for(int i=0;i<chars.length;){
            char curr=chars[i];
            int count=0;
            while(i<chars.length&&chars[i]==curr){
                 //System.out.println(chars[i]+" "+chars[i+1]);
                count++;
                i++;
            }
            chars[k++]=curr;
            if(count!=1){
                for(char ch:Integer.toString(count).toCharArray()){
                    chars[k++]=ch;
                }
            }
            //System.out.println(count);
        }
        
        return k;
    }
}