public class Solution {
    public String reverseStr(String s, int k) {
        char[] ca = s.toCharArray();
        for (int left = 0; left < ca.length; left += 2 * k) {
            int i = left, j = Math.min(left + k - 1, ca.length - 1); 
            while(i < j) {
                char tmp = ca[i];
                ca[i] = ca[j];
                ca[j] = tmp;
                 i++; j--;
            }
        }
        return new String(ca);
    }
}