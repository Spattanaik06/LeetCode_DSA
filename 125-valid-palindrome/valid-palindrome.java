class Solution {
    public boolean isPalindrome(String s) 
    {
        s= s.trim().replaceAll("[^A-Za-z0-9]","").toLowerCase();

    //Using Built-in function
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return (sb.toString().equals(s));




    //Without Built-In Function
        // int start=0;
        // int end=s.length()-1;
        // while(start<end)
        // {
        //     if(s.charAt(start)!=s.charAt(end))
        //     {
        //         return false;
        //     }
        //     start++;
        //     end--;

        // }
        // return true;
        
    }
}