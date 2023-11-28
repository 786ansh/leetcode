class Solution {
    public int countPairs(List<Integer> arr, int target) {
        Collections.sort(arr);
        int count=0;
        int left=0;
        int right=arr.size()-1;
        while(left<=right){
            if(arr.get(left)+arr.get(right)<target){
                count+=right-left;
                left++;
            }
            else right--;
        }
        return count;
    }
}