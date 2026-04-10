class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        // Find max pile (upper bound)
        for (int p : piles) {
            high = Math.max(high, p);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Calculate total hours needed at speed mid
            long totalHours = 0;
            for (int p : piles) {
                totalHours += (p + mid - 1) / mid; // ceil division
            }

            if (totalHours <= h) {
                ans = mid;          // possible answer
                high = mid - 1;     // try smaller speed
            } else {
                low = mid + 1;      // increase speed
            }
        }

        return ans;
    }
}