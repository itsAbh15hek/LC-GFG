import java.util.Scanner;

public class UnSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
      int l = sc.nextInt();
      int[] a = new int[l];
      for (int j = 0; j < l; j++) {
        a[j] = sc.nextInt();
      }
      res[i] = calculateSteps(a, l);
    }
    for (int i = 0; i < n; i++)
      System.out.println(res[i]);
    sc.close();
  }

  static int calculateSteps(int[] a, int l) {
    if (l == 1)
      return 0;
    int diff = Integer.MAX_VALUE;
    for (int i = 1; i < l; i++)
      if (diff > a[i] - a[i - 1])
        diff = a[i] - a[i - 1];
    if (diff < 0)
      return 0;
    int count = 1 + (diff) / 2;
    return count;
  }

}