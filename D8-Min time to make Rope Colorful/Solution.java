class Solution {
  public int minCost(String colors, int[] neededTime) {
    int time = 0;
    for (int i = 0; i < colors.length() - 1; i++) {
      if (colors.charAt(i) == colors.charAt(i + 1)) {
        int k = 1;
        int max = neededTime[i];
        int maxInd = i;

        for (int j = i + 1; j < colors.length() && colors.charAt(i) == colors.charAt(j); j++) {
          k++;
          if (neededTime[j] > max) {
            max = neededTime[j];
            maxInd = j;
          }
        }
        // for(int j=i+1;j<colors.length()&&colors.charAt(i)==colors.charAt(j);j++)
        // {
        // if(j!=maxInd)
        // time+=neededTime[j];
        // }
        for (int j = i; j < i + k; j++)
          if (j != maxInd)
            time += neededTime[j];
        i = i + k - 1;
      }

    }
    return time;
  }
}