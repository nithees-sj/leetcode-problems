class Solution {
    public int findGCD(int[] nums) {
        int m=nums[0];
        int n=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < m) {
                m = nums[i];
            }
            if (nums[i] > n) {
                n = nums[i];
            }
        }

        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
    return m;
    }
}
