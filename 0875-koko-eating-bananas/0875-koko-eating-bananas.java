class Solution {
    public static int maxi(int arr[]){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx) mx=arr[i];
        }
        return mx;
    }
    public static int calc_tm(int arr[],int mid){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)(arr[i]) / (double)(mid));
        }
        return sum;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int ans=Integer.MAX_VALUE;
        int low=1;
        int high=maxi(arr);
        while(low<=high){
            int mid=low+(high-low)/2;
            int time_req=calc_tm(arr,mid);
            if (time_req<=h) {
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
        
        
    }
}