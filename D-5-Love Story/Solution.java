import java.util.*;

public class LoveStory {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] a = new String[n];
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLine();
    }

    for (int i = 0; i < n; i++) {
      int res = match(a[i]);
      System.out.println(res);
    }
  }

  static int match(String s) {
    String c = "codeforces";
    if (s.length() < c.length())
      return -1;
    int count = 0;
    for (int i = 0; i < c.length(); i++) {
      if (s.charAt(i) != c.charAt(i))
        count++;
    }
    return count;
  }
}