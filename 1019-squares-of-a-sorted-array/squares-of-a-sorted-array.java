class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int res[] = new int[nums.length];

        for(int i=nums.length-1;i>=0;i--){

            int rightSquare = nums[right]*nums[right];
            int leftSquare = nums[left]*nums[left];
            
            if(leftSquare>rightSquare){
                res[i] = leftSquare;
                left++;
            }
            else{
                res[i] = rightSquare;
                right--;
            }
        }
        return res;
    }
}