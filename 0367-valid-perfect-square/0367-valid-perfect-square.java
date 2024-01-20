class Solution {
    public boolean isPerfectSquare(int num) {
        long s=1;
        long end=num;
        while(s<=end){
           long mid=s+(end-s)/2;
            if(mid*mid==num) return true;
            else if(mid*mid>num) end=mid-1;
            else s=mid+1;
        }
        return false;
        
    }
}