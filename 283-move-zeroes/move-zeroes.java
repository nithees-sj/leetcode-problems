class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0){
            System.out.println(0);
        }

        int i=0;

        for(int j=0;j<nums.length;j++){
            if(nums[j] != 0){
                nums[i]=nums[j];
                i++;
            }
        }

        while(i<nums.length){
            nums[i]=0;
            i++;
        }
        System.out.print(nums);
    }
}