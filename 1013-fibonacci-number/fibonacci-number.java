class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;

        if(n==0)return 0;
        for(int i=1;i<n;i++){
            int ans = b;
            b=b+a;
            a=ans;
        }

        return b;
    }
}