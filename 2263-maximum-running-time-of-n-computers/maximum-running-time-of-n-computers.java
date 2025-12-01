class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int b : batteries) sum += b;

        long left = 0, right = sum / n;

        while (left < right) {
            long mid = (left + right + 1) / 2;

            long total = 0;
            for (int b : batteries) {
                total += Math.min(b, mid);
            }

            if (total >= mid * n) {
                left = mid;     // mid is possible → try higher
            } else {
                right = mid - 1; // mid is too high
            }
        }
        return left;
    }
}
