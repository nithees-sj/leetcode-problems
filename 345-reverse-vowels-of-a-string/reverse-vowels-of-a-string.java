class Solution {
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || 
               c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || 
               c == 'O' || c == 'U';
    }
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char arr[] = s.toCharArray();
        while(left<right){
            if(!isVowel(arr[left])){
                left++;
            }
            else if(!isVowel(arr[right])){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}