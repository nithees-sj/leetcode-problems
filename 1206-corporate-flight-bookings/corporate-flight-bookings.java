class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[] = new int[n];
        for(int q[]:bookings){
            int s = q[0]-1;
            int e = q[1];
            int seat = q[2];

            ans[s]+=seat;

            if(e<n){
                ans[e]-=seat;
            }
        }
        for(int i=1;i<n;i++){
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}