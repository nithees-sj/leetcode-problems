//Solving the problem using slidiing window method 
//Logic is the add the values till the k in the aray and to find the next larget average
//Need to add the next last set's element and then find the average buy subtracting the previous's lefting element 
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        int windowMax = 0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        windowMax=windowSum;
        for(int i=k;i<nums.length;i++){
            windowSum+=nums[i];
            windowSum-=nums[i-k];
            windowMax=Math.max(windowSum,windowMax);
        }
        return (double)windowMax/k;
    }
}