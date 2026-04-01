class Solution {
    public boolean isVowel(char a){
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        max=count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            max=Math.max(count,max);
        } 
        return max;
   }
}