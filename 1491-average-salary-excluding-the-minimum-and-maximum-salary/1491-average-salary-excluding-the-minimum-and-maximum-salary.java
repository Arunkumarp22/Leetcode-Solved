class Solution {
    public double average(int[] salary) {
        double res=0.0;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++){
            res+=salary[i];
        }
        
        return res/(salary.length-2);
    }
}