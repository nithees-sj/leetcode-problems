class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;

        int[] prefix = new int[n];

        if (isVowel(words[0].charAt(0)) && 
            isVowel(words[0].charAt(words[0].length() - 1))) {
            prefix[0] = 1;
        } else {
            prefix[0] = 0;
        }

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1];

            String w = words[i];
            char first = w.charAt(0);
            char last = w.charAt(w.length() - 1);

            if (isVowel(first) && isVowel(last)) {
                prefix[i]++;
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];

            if (L == 0) {
                ans[i] = prefix[R];
            } else {
                ans[i] = prefix[R] - prefix[L - 1];
            }
        }

        return ans;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}