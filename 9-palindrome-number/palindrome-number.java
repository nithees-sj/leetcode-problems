class Solution {
    public boolean isPalindrome(int x) {
        int rev =0;
        int dup = x;

        while(x>0){
            int last = x%10;

            rev=rev*10+last;

            x/=10;
        }

        if(dup==rev){
            return true;
        }
        return false;
    }
}