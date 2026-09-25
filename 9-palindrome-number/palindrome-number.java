class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
        int number = x;
        int reverse = 0;

        while(number!=0){
            int lastNumber = number%10;
            reverse = (reverse*10)+lastNumber;
            number/=10;
        }

        return x == reverse;
    }
}