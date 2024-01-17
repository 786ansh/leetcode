class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr=new ArrayList<>();
        paranthesis(0,0,n,"",arr);
        return arr;
        
    }
     public static  void paranthesis(int o,int c,int n,String ans ,List<String> arr){
        if((o==n) && (c==n)){
           arr.add(ans);
            return ;
        }
        if(o>n) return; 
       
        
        paranthesis(o+1, c, n, ans+"(",arr);
        if(c<o) paranthesis(o, c+1, n, ans+")",arr);
    }
    
}