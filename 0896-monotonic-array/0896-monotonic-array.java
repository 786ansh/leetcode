class Solution {
    public boolean isMonotonic(int[] nums) {
        return inc(nums) || dec(nums);
        
    }
    public static boolean inc(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    public static boolean dec(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]) return false;
        }
        return true;
    }
}