class Solution {
    public int longestPalindrome(String s) {
        
        int count=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count++;
            }else{
                set.add(s.charAt(i));
            }
        }
        
        if(!set.isEmpty()) return count*2+1;
        return count*2;
    }
}