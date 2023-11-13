class Solution {
    public int arrangeCoins(int n) {
       int sum=0;
    int coins=1;
        while(n>=0){
            n-=coins;
            sum+=1;
            coins++;
        }
        return sum-1;
            
    }
}