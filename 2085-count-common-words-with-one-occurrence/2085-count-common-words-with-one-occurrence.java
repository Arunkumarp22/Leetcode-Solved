class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer>map1=new HashMap<>();
        Map<String, Integer>map2=new HashMap<>();
        int count=0;
        for(String s:words1){
            if(map1.containsKey(s)){
                map1.put(s,map1.get(s)+1);
            }
            else {
                map1.put(s,1);
            }
        }
        for(String s:words2){
            if(map2.containsKey(s)){
                map2.put(s,map2.get(s)+1);
            }
            else {
                map2.put(s,1);
            }
        }
        for(String s:words1){
            if(map1.containsKey(s) && map2.containsKey(s))
            {
                if(map1.get(s)==1 && map2.get(s)==1)
                {
                    count++;
                }
            }
        }
        return count;
    }
}