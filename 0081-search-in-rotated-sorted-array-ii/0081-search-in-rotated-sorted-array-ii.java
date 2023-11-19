class Solution {
    public boolean search(int[] arr, int target) {
      Arrays.sort(arr);
        int s=0;
        int end=arr.length-1;
        while(s<=end){
            int mid=s+(end-s)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]>target) end=mid-1;
            else s=mid+1;
        }
        return false;
        
    }
}