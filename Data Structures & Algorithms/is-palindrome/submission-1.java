class Solution {
    public boolean isPalindrome(String s) {
        int idxLeft=0;
        int idxRight=s.length()-1;
        char left,right;
        while(idxLeft<idxRight)
        {
            left=s.charAt(idxLeft);
            left=Character.toLowerCase(left);
           right=s.charAt(idxRight);
            right=Character.toLowerCase(right);
            while(!Character.isLetterOrDigit(left) && idxLeft<idxRight)
            {
               
                left=s.charAt(++idxLeft);
                left=Character.toLowerCase(left);
                
            }
              while(!Character.isLetterOrDigit(right) && idxLeft<idxRight)
            {
               
                right=s.charAt(--idxRight);
                right=Character.toLowerCase(right);
                
            }
            if(left!=right)
            {
                return false;
            }
            idxLeft++;
            idxRight--;
        }
        return true;
    }
}
