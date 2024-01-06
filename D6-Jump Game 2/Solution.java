class Solution {
    public int jump(int[] nums) {
        int n = nums.length - 1;
        int a[] = new int[n + 1];
        a[n] = 0;
        n--;
        while (n >= 0) {
            int min=nums.length;
            for(int i=1;i<=nums[n];i++){
                if(n+i<nums.length&&1+a[n+i]<min)
                    min=1+a[n+i];
            }
            a[n]=min;
            // System.out.println(Arrays.toString(a));
            n--;
        }
        return a[0];
    }
}