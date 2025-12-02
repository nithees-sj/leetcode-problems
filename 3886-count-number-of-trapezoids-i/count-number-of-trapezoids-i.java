class Solution {
    static final long MOD = 1_000_000_007;

    public int countTrapezoids(int[][] points) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] p : points) {
            map.put(p[1], map.getOrDefault(p[1], 0) + 1);
        }

        List<Long> A = new ArrayList<>();
        for (int freq : map.values()) {
            if (freq >= 2) {
                long c = (long) freq * (freq - 1) / 2;
                A.add(c % MOD);
            }
        }

        if (A.size() < 2) return 0;

        long S = 0, SS = 0;

        for (long x : A) {
            S = (S + x) % MOD;
            SS = (SS + (x * x) % MOD) % MOD;
        }

        long ans = (S * S % MOD - SS + MOD) % MOD;

        long inv2 = (MOD + 1) / 2;
        ans = ans * inv2 % MOD;

        return (int) ans;
    }
}
