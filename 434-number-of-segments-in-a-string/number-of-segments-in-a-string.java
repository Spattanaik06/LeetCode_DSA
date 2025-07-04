class Solution {
    public int countSegments(String s) 
    {
        // s=s.trim();
        // if(s.length()==0) return 0;
        // String [] str=s.split(" ");
        // return str.length;

        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ' && (i==0||s.charAt(i-1)==' '))
            {
                count++;
            }
        }
        return count;
    }
}