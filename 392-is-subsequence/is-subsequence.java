class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        // List<Character> list1=new ArrayList<>();
        // for(char c :s.toCharArray())
        // {
        //     list1.add(c);
        // }
        // List<Character> list2=new ArrayList<>();
        
        // for(char c:t.toCharArray())
        // {
        //     if(list1.contains(c))
        //     {
        //         list2.add(c);
        //     }
        // }
        // return list1.equals(list2);

        int i=0; int j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
            }
            j++;
        }
        return i==s.length();

    }
}