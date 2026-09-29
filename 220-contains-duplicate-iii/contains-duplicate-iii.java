class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            long num = nums[i];

            // Find the smallest number >= num - valueDiff
            Long x = set.ceiling(num - valueDiff);

            if (x != null && x <= num + valueDiff) {
                return true;
            }

            set.add(num);

            // Keep only the last indexDiff elements
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}