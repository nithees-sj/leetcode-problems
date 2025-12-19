import java.util.*;

class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {

        Arrays.sort(meetings, Comparator.comparingInt(a -> a[2]));

        boolean[] knows = new boolean[n];
        knows[0] = true;
        knows[firstPerson] = true;

        DSU dsu = new DSU(n);

        int i = 0;
        while (i < meetings.length) {
            int time = meetings[i][2];
            List<Integer> people = new ArrayList<>();

            // process all meetings at same time
            while (i < meetings.length && meetings[i][2] == time) {
                int x = meetings[i][0];
                int y = meetings[i][1];
                dsu.union(x, y);
                people.add(x);
                people.add(y);
                i++;
            }

            // check which components contain secret
            Set<Integer> secretRoots = new HashSet<>();
            for (int p : people) {
                if (knows[p]) {
                    secretRoots.add(dsu.find(p));
                }
            }

            // spread secret only inside valid components
            for (int p : people) {
                if (secretRoots.contains(dsu.find(p))) {
                    knows[p] = true;
                }
            }

            // reset DSU for next time block
            for (int p : people) {
                dsu.reset(p);
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int p = 0; p < n; p++) {
            if (knows[p]) res.add(p);
        }
        return res;
    }
}

class DSU {
    int[] parent;

    DSU(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }

    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    void union(int a, int b) {
        parent[find(a)] = find(b);
    }

    void reset(int x) {
        parent[x] = x;
    }
}
