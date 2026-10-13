class Solution {
    public boolean isSubsequence(String s, String t) {
        char sc[] = s.toCharArray();
        char tc[] = t.toCharArray();

        int si = 0;
        int ti = 0;

        while(si<s.length() && ti<t.length()){
            if(sc[si] == tc[ti]){
                si++;
                ti++;
            }
            else{
                ti++;
            }
        }

        if(si == s.length()) return true;
        else return false;
    }
}