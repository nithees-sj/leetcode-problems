class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        for(int num:nums){
            if(!list.add(num)){
                return true;
            }
        }
        return false;
    }
}