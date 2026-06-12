class Solution {
    public int fib(int n) {
        return fibanoci(n);
    }

    public int fibanoci(int n){
        if(n<=1){
            return n;
        }

        return fibanoci(n-1)+fibanoci(n-2);
    }
}