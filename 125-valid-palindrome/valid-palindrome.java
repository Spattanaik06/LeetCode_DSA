class Solution {
    public boolean isPalindrome(String s) 
    {
        //Using Built-in function

         s= s.trim().replaceAll("[^A-Za-z0-9]","").toLowerCase();
    //     StringBuilder sb=new StringBuilder(onlyWord);
    //     sb.reverse();
    //     return (sb.toString().equals(onlyWord));

        //Without Built-In Function
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;

        }
        return true;
        
    }
}