class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }

        if(s.length() == 0){
            return true;
        }

        int index = 0;
        for(int ch : t.toCharArray()){
            char curr = s.charAt(index);
            if(ch == curr){
                index++;
                if(index>s.length()-1){
                    break;
                }
            }
        }
        return index == s.length();
    }
}