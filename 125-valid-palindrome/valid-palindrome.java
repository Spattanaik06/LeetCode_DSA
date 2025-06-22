class Solution {
    public boolean isPalindrome(String s) 
    {
       String onlyWord= s.trim().replaceAll("[^A-Za-z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder(onlyWord);
        sb.reverse();
        if(sb.toString().equals(onlyWord))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}