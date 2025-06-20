class Solution {
    public int firstUniqChar(String s) 
    {
        
        // for(int i=0;i<s.length();i++)
        // {
        //     char c=s.charAt(i);
        //     if(s.indexOf(c)==s.lastIndexOf(c))
        //     {
        //         return i;
        //     }
        // }
        // return -1;


        // Map<Character,Long> map=new LinkedHashMap<>();
        // for(char c : s.toCharArray())
        // {
        //     Long count=map.getOrDefault(c,0L)+1;
        //     map.put(c,count);
        // }
        // for(int i=0;i<s.length();i++)
        // {
        //     if(map.get(s.charAt(i))==1)
        //     {
        //         return i;
        //     }
        // }
        
        // return -1;

       return s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().map(s::indexOf).orElse(-1);
    }
}