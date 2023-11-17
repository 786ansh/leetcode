class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0) arr.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<0) arr2.add(nums[i]);
        }
        for(int i=0;i<nums.length/2;i++){
            nums[2*i]=arr.get(i);
            nums[2*i+1]=arr2.get(i);
        }
        return nums;
        
        
        
    }
}