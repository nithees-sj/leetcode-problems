class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Found target
            if (nums[mid] == target) return mid;


            if (nums[left] <= nums[mid]) {

                // left region
                if(target>=nums[left])// you verify target is there on left or not
                {
                    // use binery serch
                    if(nums[mid]<target)
                    {
                        left=mid+1;
                    }
                    else
                    {
                        right=mid-1;
                    }
                }
                else
                {         
                      left=mid+1; // shift the left
                }
            }
             else {
                // right region
                if(nums[right]>=target  )// verify the value is there in right region or not 
                {
                    // use the binery serch
                    if(nums[mid]<target)
                    {
                        left=mid+1;
                    }
                    else
                    {
                        right=mid-1;
                    }
                }
                else
                {
                    right=mid-1;
                }
                // right region
            }
        }
        return -1; // Not found
    }
}