import java.util.*;

public class Pal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] a = new String[n];
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLine();
    }
    for (int i = 0; i < n; i++) {
      System.out.println(checkPal(a[i]));
    }
    sc.close();
  }

  static String checkPal(String s) {
    int n = s.length();
    if (n < 4)
      return "No";

    // int cnt[]=new int[26];
    boolean cnt = false;
    int i = n % 2 == 0 ? n / 2 : (n / 2) + 1;

    char c = s.charAt(i);
    for (i = i + 1; i < n; i++) {
      // int c=(s.charAt(i)-'a');
      // cnt[c]++;
      if (s.charAt(i) != c)
        cnt = true;
    }
    if (cnt == true)
      return "Yes";

    return "No";
  }
}