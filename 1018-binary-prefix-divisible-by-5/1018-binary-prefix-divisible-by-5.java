class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> list=new ArrayList<>();
        int ans=0;
        for(int i=0;i<nums.length;i++) {
            ans=(ans*2+nums[i])%5;
            list.add(ans==0);
        }
        return list;
        
    }
}