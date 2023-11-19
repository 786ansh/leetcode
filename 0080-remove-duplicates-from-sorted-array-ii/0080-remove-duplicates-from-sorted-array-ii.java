class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]==nums[i-count-2]) count++;
            nums[i-count]=nums[i];
        }
        return nums.length-count;
        
    }
}