import java.util.*;

public class Cards {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] a = new String[n];
    sc.nextLine();
    for (int i = 0; i < n; i++)
      a[i] = sc.nextLine();
    for (int i = 0; i < n; i++)
      System.out.println(test(a[i]));
    sc.close();
  }

  static String test(String s) {
    if (s.equals("abc"))
      return "YES";
    for (int i = 0; i < 3; i++) {
      String t = swap(s, i);
      if (t.equals("abc"))
        return "YES";
    }
    return "NO";
  }

  static String swap(String s, int i) {
    char[] a = s.toCharArray();
    char c = a[i];
    a[i] = a[(i + 1) % 3];
    a[(i + 1) % 3] = c;
    return new String(a);
  }
}
