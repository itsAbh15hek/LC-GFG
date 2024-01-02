class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,nSum=0,n=nums.length;
        for(int i=0;i<n;i++)
            {
                nSum+=(i);
                sum+=nums[i];
            }
        return nSum+n-sum;
    }
}