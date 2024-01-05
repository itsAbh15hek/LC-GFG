class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal))
            return true;
        if(s.length()==goal.length())
        {
            s=s+s;
            if(s.contains(goal)) return true;
        }

        return false;
    }
}