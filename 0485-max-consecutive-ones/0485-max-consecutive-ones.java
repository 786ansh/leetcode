class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int one=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) one++;
            else {
               
                ans=Math.max(ans,one);
                one=0;
               
                
            }
        }
        ans=Math.max(ans,one);
        return ans;
    }
}