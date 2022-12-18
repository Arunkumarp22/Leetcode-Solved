class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.empty()&&temperatures[i]>temperatures[st.peek()]){
                int tar=st.pop();
                res[tar]=i-tar;
            }
            st.push(i);
        }
        
        return res;
    }
}