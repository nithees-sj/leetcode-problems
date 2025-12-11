import java.util.*;

class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        IntSummary[] col = new IntSummary[n + 1];
        IntSummary[] row = new IntSummary[n + 1];

        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            if (col[x] == null) col[x] = new IntSummary();
            col[x].add(y);
            if (row[y] == null) row[y] = new IntSummary();
            row[y].add(x);
        }

        int ans = 0;
        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            IntSummary cs = col[x];
            IntSummary rs = row[y];
            boolean hasLeftRight = cs.min < y && cs.max > y;
            boolean hasUpDown = rs.min < x && rs.max > x;
            if (hasLeftRight && hasUpDown) ans++;
        }

        return ans;
    }

    private static class IntSummary {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        void add(int v) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
    }
}
