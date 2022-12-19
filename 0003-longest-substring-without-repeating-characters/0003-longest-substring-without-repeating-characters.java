class Solution {
    public int lengthOfLongestSubstring(String s) {
       int i=0,j=0,max=0;;
        Set<Character> set=new HashSet<>();
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                
                set.remove(s.charAt(i));
                i++;
            }
            else{
                //set.add(s.charAt(i));
                max=Math.max(max,(j-i)+1);
            System.out.println(i+" "+j);
            set.add(s.charAt(j));
            j++;
            }
            
        }
        return max;
    }
}