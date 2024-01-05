
//User function Template for Java

class Solution {
  // Function to merge two nodes a and b.
  public void union_(int a, int b, int par[], int rank[]) 
  {
    // add your code here
    // a--;b--;
    // System.out.println(a+":"+par[a]+":"+rank[a]);
    // System.out.println(b+":"+par[b]+":"+rank[b]);
    a = findPar(a, par);
    b = findPar(b, par);
    if (a != b) {
      if (a >= b) {
        par[b] = a;
        rank[a] += rank[b];
      } else {
        par[a] = b;
        rank[b] += rank[a];
      }
    }

    // for(int i=1;i<=5;i++)
    // {
    // System.out.print(par[i]+" ");
    // System.out.print("\t"+rank[i]+" \t\t");
    // }
    // System.out.println();
  }

  // Function to check whether 2 nodes are connected or not.
  public Boolean isConnected(int a, int b, int par[], int rank[]) {
    // add your code here

    int pA = findPar(a, par);
    int pB = findPar(b, par);

    if (pA == pB)
      return true;
    return false;
  }

  public int findPar(int n, int par[]) {
    if (par[n] == n)
      return n;
    else
      return findPar(par[n], par);
  }

}