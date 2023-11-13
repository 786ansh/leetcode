class Solution {
    public static boolean isequalm(int arr[],int mid,int m,int k ){
        int count=0;
        int blossoms=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }
            else {
                blossoms+=count/k;
                count=0;
            }
        }
        blossoms+=count/k;
        return  blossoms>=m;
    }
    public int minDays(int[]arr, int m, int k) {
        int mk= (m*k);
        if(mk>arr.length) return -1;
        int min=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
            min=Math.min(min,arr[i]);
        }
        int res=-1;
        int low=min;
        int high=maxi;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isequalm( arr, mid, m, k )){
                res=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return res;
        
    }
}