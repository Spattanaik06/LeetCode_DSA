class Solution {
    public int trap(int[] height) 
    {
        int lh[]=new int[height.length];
        int rh[]=new int[height.length];
        lh[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            lh[i]=Math.max(height[i],lh[i-1]);
        }
        rh[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            rh[i]=Math.max(height[i],rh[i+1]);
        }
        int totalWaterTrap=0;
        for(int i=0;i<height.length;i++)
        {
           int  potentialHeight=Math.min(lh[i],rh[i]);
            totalWaterTrap=totalWaterTrap + (potentialHeight - height[i]);
        }
        return totalWaterTrap;
    }
}