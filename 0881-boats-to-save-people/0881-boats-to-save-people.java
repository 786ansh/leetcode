class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int count=0;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int sum=arr[s]+arr[e];
            if(sum<=limit){
                count++;
                s++;
                e--;
            }
            else{
                count++;
                e--;
            }
        }
        return count;
       
    }
}