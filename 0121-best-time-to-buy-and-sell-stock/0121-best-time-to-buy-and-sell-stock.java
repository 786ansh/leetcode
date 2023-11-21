class Solution {
    public int maxProfit(int[] arr) {
       int diff=0;
        int mini=arr[0];
        for(int i=0;i<arr.length;i++){
            diff=Math.max(diff,arr[i]-mini);
            mini=Math.min(mini,arr[i]);
        }
        return diff;
    }
}