class Solution {
    public int lengthOfLastWord(String s) 
    {
       
       String[] str=s.trim().split(" ");
       for(int i=str.length-1;i>=0;i--)
       {
        return  str[i].length();
       }
       return 0;
    }
}