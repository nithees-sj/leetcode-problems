class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int count = 0;
        for(int num:nums){
            if(count<2 || num!=nums[count-2]){
                nums[count] = num;
                count++;
            }
        }
        return count;
    }
}