class Solution {
    public int maximumDifference(int[] nums) {
        int diff=nums[1]-nums[0];
        int min_value=nums[0];
        for(int i=0;i<nums.length;i++){
            diff=Math.max(diff,nums[i]-min_value);
            min_value=Math.min(min_value,nums[i]);
        }
        if(diff==0) return -1;
        return diff;
    }
}