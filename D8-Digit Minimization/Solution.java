import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      System.out.println(play(a[i]));
    }
    sc.close();
  }

  static int play(int n) {
    if (n < 10)
      return n;
    if (n < 100)
      return n % 10;
    else {
      int s = 10;
      while (n > 0) {
        if (n % 10 < s)
          s = n % 10;
        n /= 10;
      }
      return s;
    }
  }
}