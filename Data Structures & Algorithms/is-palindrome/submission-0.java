class Solution {
    public boolean isPalindrome(String s) {
        String str1="";
        str1=s.replaceAll("[^0-9a-zA-Z]","");
        str1=str1.toLowerCase();
        int len=str1.length();
        int l=0,r=len-1;
        while(l<r)
        {
            if(str1.charAt(l)!=str1.charAt(r))
            {
                return false;
               
            }
            l++;
            r--;
        }
        return true;
    }
}
