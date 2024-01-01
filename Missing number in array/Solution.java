class Solution {
  int missingNumber(int array[], int n) {
    // Your Code Here
    int sum = 0, nSum = 0;
    for (int i = 0; i < n - 1; i++) {
      nSum += (i + 1);
      sum += array[i];
    }
    return nSum + n - sum;
  }
}