class Solution {
    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    public List<Integer> getRow(int rowIndex) {
         List<Integer> list = new ArrayList<>();
        for(int i=1;i<=rowIndex+1;i++) list.add((int)(nCr(rowIndex+1-1,i-1)));
        return list;
        
    }
}