class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();
        while(i < j) {
            while(i < j && !isAlphaNumeric(arr[i])) i++;
            while(i < j && !isAlphaNumeric(arr[j])) j--;
            if(i < j && Character.toLowerCase(arr[i]) != Character.toLowerCase(arr[j])) return false;
            i++;
            j--;
        }
        return true;
    }
    
    public boolean isAlphaNumeric(char c) {
        return Character.isDigit(c) || Character.isLetter(c);
    }
}