class Solution {
    public int countCollisions(String directions) {
        int n = directions.length();
        char[] arr = directions.toCharArray();

        int left = 0, right = n - 1;

        while (left < n && arr[left] == 'L') left++;

        while (right >= 0 && arr[right] == 'R') right--;

        int collisions = 0;

        for (int i = left; i <= right; i++) {
            if (arr[i] == 'R' || arr[i] == 'L') collisions++;
        }

        return collisions;
    }
}
