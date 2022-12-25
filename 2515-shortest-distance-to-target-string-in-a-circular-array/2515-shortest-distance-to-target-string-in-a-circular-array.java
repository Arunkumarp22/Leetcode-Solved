
class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                int dist = Math.abs(i - startIndex);
                int oppDist = words.length - dist;
                ans = Math.min(ans, Math.min(dist, oppDist));
            }
        }

        return ans == Integer.MAX_VALUE? -1: ans;
    }
}
