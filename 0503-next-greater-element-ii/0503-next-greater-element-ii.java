class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len=nums.length;
        int res[]=new int[len];
        Stack<Integer> s=new Stack<>();
        
        for(int i=2*len-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()<=nums[i%len]){
                s.pop();
            }
            
            if(i<len){
                if(!s.isEmpty())  res[i%len]=s.peek();
                else res[i%len]=-1;
            }
            s.push(nums[i%len]);
        }
        return res;
    }
}