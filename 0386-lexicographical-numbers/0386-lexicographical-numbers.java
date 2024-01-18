class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> arr=new ArrayList<>();
        counting(0, n,arr);
        return arr;
        
    }
    public static void counting(int curr,int  n,List<Integer> arr) {
        if(curr>n){
            return;
        }
        
        if(curr!=0)  arr.add(curr);
        int i=0;
        if(curr==0) i=1;
        for(;i<=9;i++){
            counting(curr*10+i, n,arr);

        }
    }
}