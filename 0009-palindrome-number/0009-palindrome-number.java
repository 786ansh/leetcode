class Solution {
    public boolean isPalindrome(int x) {
        String ans="";
        ans+=x;
        int i=0,j=ans.length()-1;
        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}