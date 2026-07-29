class Solution {
    public boolean isAnagram(String s, String t) {

        boolean res = true;

        if(s.length() != t.length()){
            return false;
        }

        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            freq[t.charAt(i) - 'a']--;
            freq[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                res = false;
            }
        }
        return res;
    }
}