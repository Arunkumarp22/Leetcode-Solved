class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> s=new Stack<>();
        int[] left=new int[heights.length];
        int[] right=new int[heights.length];
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()) left[i]=0;
            else left[i]=s.peek()+1;
            s.push(i);
        }
        while(!s.isEmpty()) s.pop();
        
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
                s.pop();
            }
            
            if(s.isEmpty()) right[i]=n-1;
            else right[i]=s.peek()-1;
            s.push(i);
        }
        
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,(right[i]-left[i]+1)*heights[i]);
        }
        return max;
    }
}