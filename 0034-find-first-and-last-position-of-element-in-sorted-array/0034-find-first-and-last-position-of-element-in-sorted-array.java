class Solution {
        public static int first(int[] arr,int k){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
           int mid=s+(e-s)/2;
            if(arr[mid]==k){
                e=mid-1;
                ans=mid;

            }
            else if(arr[mid]>k) e=mid-1;
            else s=mid+1;
        }
        return ans;
    }
    public static int last(int[] arr,int k){
        int s=0;
        int e=arr.length-1;
        int lst=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==k){
                s=mid+1;
                lst=mid;

            }
            else if(arr[mid]>k) e=mid-1;
            else s=mid+1;
        }
        return lst;
    }
    public int[] searchRange(int[] arr, int k) {
         return new int[]{first(arr, k),last(arr, k)};
    
        
    }
}