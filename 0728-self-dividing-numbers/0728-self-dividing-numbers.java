class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int j = i;
            while(j > 0) {
                if ((j % 10 == 0) || (i % (j % 10) != 0)){
                    break;
                }
                j /= 10;
            }
            if (j == 0) list.add(i); 
        }
        return list;
    }
}