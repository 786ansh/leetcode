class Solution {
    public static int totalsum(int arr[],int mid){
        int ans=0;
        for(int i=0;i<arr.length;i++) ans+=Math.ceil((double)    (arr[i])/ (double)(mid));
        return ans;
    }
    public int smallestDivisor(int[] arr, int limit) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) maxi=Math.max(maxi, arr[i]);
        int low=1;
        int high=maxi;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(totalsum(arr,mid)<=limit) high=mid-1;
            else low=mid+1;
        }
       
        return low;
        
    }
}