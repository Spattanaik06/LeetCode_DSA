class Solution {
    public String reverseVowels(String s) 
    {
      char c[]=s.toCharArray();
      String vowel="aeiouAEIOU";
      int left=0;
      int right=c.length-1;
      while(left<right)
      {
        while(left<right && vowel.indexOf(c[left])==-1)left++;
        while(left<right && vowel.indexOf(c[right])==-1)right--;
        char temp=c[left];
        c[left]=c[right];
        c[right]=temp;
        left++;
        right--;
      }
      return new String(c);

    }
}