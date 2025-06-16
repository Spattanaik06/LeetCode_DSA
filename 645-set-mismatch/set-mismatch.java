class Solution {
    public int[] findErrorNums(int[] nums)
    {
        int duplicate=-1,missing=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num :nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=1;i<=nums.length;i++)
        {
            int count=map.getOrDefault(i,0);
            if(count==2)
            {
                duplicate=i;
            }
            else if(count==0)
            {
                missing=i;
            }
        }
        return new int[]{duplicate,missing};
    }
}