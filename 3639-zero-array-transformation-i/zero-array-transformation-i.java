class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int diff[] = new int [n+1];
        for(int q[]:queries){
            int s=q[0];
            int e=q[1];
            diff[s]-=1;
            if(e+1<n){
                diff[e+1]+=1;
            }
        }
        int crr=0;
        for(int i=0;i<n;i++){
            crr+=diff[i];
            if(nums[i]+crr>0){
                return false;
            }
        }
        return true;
    }
}