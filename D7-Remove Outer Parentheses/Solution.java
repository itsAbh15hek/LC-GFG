class Solution {
  public String removeOuterParentheses(String s) {
      StringBuilder ans=new StringBuilder();
      StringBuilder ss=new StringBuilder();
      int open=0,close=0;
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='(')
              open++;
          if(s.charAt(i)==')')
              close++;
          ss.append(s.charAt(i));
          if(open==close) //0
          {
              
              ans.append(ss.substring(1,ss.length()-1));
              ss=new StringBuilder();
          }
      }
      return ans.toString();
  }
}