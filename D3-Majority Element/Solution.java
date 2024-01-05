class Solution {
  public int majorityElement(int[] nums) {
      int n=nums.length;
      
      int e=0,m=0,ans=0;
      for(int i=0;i<n;i++)   
      {
          e=1;
          if(i!=n-1)
          for(int j=i+1;j<n;j++)
              if(nums[i]==nums[j])
                  e++;
          if(e>m)
             {
                  m=e;
                  ans=nums[i];
             }
      }
      return ans;
  }
}