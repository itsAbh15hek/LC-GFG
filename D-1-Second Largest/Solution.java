
class Solution {
  int print2largest(int arr[], int n) {
      // code here
      if(n==0)
      return -1;
      int l=0;sl=-2;
      for(int i=0;i<n;i++)
          if(arr[i]>l)
              l=arr[i];
      for(int i=o;i<n;i++)
          if(arr[i]<l&&arr[i]>sl)
              sl=arr[i];
      if(sl<0)
          return -1;
      return sl;
  }
}