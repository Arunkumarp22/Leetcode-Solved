class Solution {
    public boolean detectCapitalUse(String word) {
        /*int countu=0,countl=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                countu++;
            }else{
                countl++;
            }
        }
        
        if(word.length()==countu||word.length()==countl||(countu==1&&Character.isUpperCase(word.charAt(0)))){
            return true;
        }else{
            return false;
        }*/
         return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
}