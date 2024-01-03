
class Compute {

  public long minMoves(long a[], long n, long k) {
    long count = 0;
    for (int i = 1; i < n; i++) {
      if (a[i] > a[i - 1]) {
        long diff = a[i] - a[i - 1];
        if (diff < k)
          diff = 1;
        else {
          if (diff % k > 0)
            diff = (diff / k) + 1;
          else
            diff = diff / k;
        }
        a[i] = a[i] - diff * (k);
        count += diff;
        // System.out.println(diff+" "+Arrays.toString(a)+" "+count);
      }
    }
    return count % (1000000007);

  }
}