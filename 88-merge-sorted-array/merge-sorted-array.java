class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        List<Integer> merge=new ArrayList<>();
       for(int i=0;i<m;i++)
       {
        merge.add(nums1[i]);
       }
       for(int j=0;j<n;j++)
       {
        merge.add(nums2[j]);
       }
        

        merge.sort((a1,b1)->a1.compareTo(b1));
        for(int k=0;k<merge.size();k++)
        {
            nums1[k]=merge.get(k);
        }

    }
}