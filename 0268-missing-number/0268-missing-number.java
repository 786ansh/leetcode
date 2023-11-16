class Solution {
    public int missingNumber(int[] arr) {
        int sum=arr.length*(arr.length+1)/2;
        int total=0;
        for(int i=0;i<arr.length;i++) total+=arr[i];
        return sum-total;
        
    }
}