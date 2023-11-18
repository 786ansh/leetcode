class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<Integer> list = new ArrayList<>();
        long ans=1;
        list.add(1);
        for(int i=1;i<rowIndex+1;i++){
            ans*=rowIndex+1-i;
            ans/=i;
            list.add((int)(ans));
        }
        return list;
        
    }
}