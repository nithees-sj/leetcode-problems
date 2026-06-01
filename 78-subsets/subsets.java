class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(int index, int[] nums,List<Integer> curr,List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // Pick
        curr.add(nums[index]);
        backtrack(index + 1, nums, curr, ans);

        // Undo choice
        curr.remove(curr.size() - 1);

        // Not Pick
        backtrack(index + 1, nums, curr, ans);
    }
}