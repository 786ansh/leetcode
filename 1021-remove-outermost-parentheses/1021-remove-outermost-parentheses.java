class Solution {
    public String removeOuterParentheses(String s) {
       
        StringBuilder ans = new StringBuilder();
        int upper = 0;
        for (char ele : s.toCharArray()) {
            if (ele == '(' && upper++ > 0) ans.append(ele);
            if (ele == ')' && upper-- > 1) ans.append(ele);
        }
        return ans.toString();
        
    }
}