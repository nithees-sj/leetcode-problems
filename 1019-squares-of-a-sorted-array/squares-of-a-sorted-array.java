class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int res[] = new int[nums.length];
        int index = nums.length-1;
        for(int i=0;i<nums.length;i++){
            int lsquare = nums[left]*nums[left];
            int rsquare = nums[right]*nums[right];

            if(lsquare>rsquare){
                res[index] = lsquare;
                left++;
            }
            else{
                res[index] = rsquare;
                right--;
            }
            index--;
        }
        return res;
    }
}