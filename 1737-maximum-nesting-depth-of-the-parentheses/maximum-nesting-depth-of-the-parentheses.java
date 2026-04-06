class Solution {
    public int maxDepth(String s) {
        int count=0,res=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                count++;
                res = Math.max(res,count);
            }
            else if(ch==')'){
                count--;
            }
        }
        return res;
    }
}