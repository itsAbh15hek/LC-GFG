class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        int n=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++)
            if(strs[i].length()<n)
                n=strs[i].length();
        
        for(int j=0;j<n;j++)
        {
            int flag=1;
            for(int i=0;i<strs.length-1;i++)
            {
                     if(strs[i].charAt(j)!=strs[i+1].charAt(j))
                        flag=0;
            }
            if(flag==1)
                ans=ans+strs[0].charAt(j);
            else 
                break;
        }

        return ans;
    }
}