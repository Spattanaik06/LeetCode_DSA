class Solution {
    public char findTheDifference(String s, String t) 
    {
        // Set<Character> set=new HashSet<>();
        // for(char c:s.toCharArray())
        // {
        //     set.add(c);
        // }

        // StringBuilder sb=new StringBuilder();
        // for(char d:t.toCharArray())
        // {
        //     if(!set.contains(d))
        //     {
        //         sb.append(d);
        //     }
        // }

        // if(sb.toString().length()==0)
        // {
        //     return ' ';
        // }
        // else
        // {
        //     return sb.toString().charAt(0);
        // }


        Map<Character,Integer>map=new HashMap<>();
        for(char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c :t.toCharArray())
        {
            if(!map.containsKey(c)||map.get(c)==0)
            {
                return c;
            }
            else
            {
                map.put(c,map.get(c)-1);
            }
        }
        return ' ';
    }
}