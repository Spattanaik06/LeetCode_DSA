class Solution {
    public String addStrings(String num1, String num2) 
    {
     int [] nums1= num1.chars().map(c->c-'0').toArray();
     int [] nums2= num2.chars().map(c-> c - '0').toArray();
     int i=nums1.length-1;
     int j=nums2.length-1;
     int carry=0;

     StringBuilder sb=new StringBuilder();
     while(i>=0 || j>=0 || carry>0)
     {
        int digit1=(i>=0) ? nums1[i--]:0;
        int digit2=(j>=0)?nums2[j--]:0;
        int sum=digit1+digit2+carry;
        sb.append(sum%10);
        carry=sum/10;
     }
     return sb.reverse().toString();
     
    }
}