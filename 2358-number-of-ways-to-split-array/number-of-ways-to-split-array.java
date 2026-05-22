class Solution {
    public int waysToSplitArray(int[] nums) {

        long totalSum = 0;

        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        int count = 0;

        // Traverse till second last element
        for (int i = 0; i < nums.length - 1; i++) {

            leftSum += nums[i];

            long rightSum = totalSum - leftSum;

            // Check condition
            if (leftSum >= rightSum) {
                count++;
            }
        }

        return count;
    }
}