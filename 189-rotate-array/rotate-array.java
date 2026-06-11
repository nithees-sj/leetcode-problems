class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[2*n];
        
        k=k%n;
        //merge two arrays
        for(int i=0;i<2*n;i++){
            arr[i] = nums[i%n];
        }

        //print the wanted result 
        int start = n-k;
        for(int i=0;i<n;i++){
            nums[i] = arr[start+i];
        }
    }
}