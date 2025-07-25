class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a =0;a<nums.length;a++)
        {
            int b=target-nums[a];
            if(map.containsKey(b))
            {
                return new int []{map.get(b),a};
            }
            map.put(nums[a],a);
        }
        return new int[]{-1,-1};
    }
}