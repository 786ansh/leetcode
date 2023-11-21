class Solution {
    public int maximumDifference(int[] nums) {
        int diff=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    diff=Math.max(diff,nums[j]-nums[i]);
                }
                
            }
        }
        if(diff==0) return -1;
        return diff;
        
    }
}