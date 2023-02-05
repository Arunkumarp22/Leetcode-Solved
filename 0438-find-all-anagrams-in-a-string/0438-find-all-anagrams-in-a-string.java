class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int[] hash=new int[26];
        
        if(s.length()<p.length()) return res;
        for(char ch:p.toCharArray()){
            hash[ch-'a']++;
            
        }
        
        
        int left=0,right=0;
        int count=p.length();
        
        while(right<s.length()){
            if(hash[s.charAt(right++)-'a']-->=1) count--;
            
            if(count==0) res.add(left);
            
            if(right-left==p.length()&&hash[s.charAt(left++)-'a']++>=0) count++;
        }
        
        return res;
        
        
    }
}