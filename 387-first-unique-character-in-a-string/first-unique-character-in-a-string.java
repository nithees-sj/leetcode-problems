import java.util.*;
class Solution {
    public int firstUniqChar(String s) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,-1);
            }
            else{
                map.put(ch,i);
            }
        }
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i);
            if(map.get(ch) != -1){
                return i;
            }
        }
        return -1;
    }
}