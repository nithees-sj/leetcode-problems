class Solution {
    public int missingNumber(int[] nums) {
        int miss = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}