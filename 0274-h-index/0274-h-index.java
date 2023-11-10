class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
     int n = arr.length;
   
     int idx = 0 ;

     while(idx < n &&  n-idx >arr[idx]){
         idx++;
     }

    return n-idx;
        
    }
}