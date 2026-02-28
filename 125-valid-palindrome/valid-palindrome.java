class Solution {
    public boolean isPalindrome(String s) 
    {
        s= s.trim().replaceAll("[^A-Za-z0-9]","").toLowerCase();

    // //Using stringBuilder
    //     StringBuilder sb=new StringBuilder(s);
    //     sb.reverse();
    //     return (sb.toString().equals(s));


    // //Using Two Pointer
    //     int start=0;
    //     int end=s.length()-1;
    //     while(start<end)
    //     {
    //         if(s.charAt(start)!=s.charAt(end))
    //         {
    //             return false;
    //         }
    //         start++;
    //         end--;

    //     }
    //     return true;


        //recursion
        int start=0;
        int end=s.length() -1;
      boolean b=print(s,start,end);  
      return b;
    }
    public static boolean print(String s,int start,int end)
    {
        if(start>=end) return true;
        if(s.charAt(start)!=s.charAt(end))
        {
            return false;
        }
       return print(s,start +1,end -1);
    }

}