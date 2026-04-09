class Solution {
	public int[] searchRange(int[] nums,int target) {
		int[] res={-1,-1};
		int l=0,r=nums.length-1;
		while(l<=r){
			int m=l+(r-l)/2;
			if(nums[m]>=target)r=m-1;
			else l=m+1;
		}
		if(l>=nums.length||nums[l]!=target)return res;
		res[0]=l;
		r=nums.length-1;
		while(l<=r){
			int m=l+(r-l)/2;
			if(nums[m]<=target)l=m+1;
			else r=m-1;
		}
		res[1]=r;
		return res;
	}
}
