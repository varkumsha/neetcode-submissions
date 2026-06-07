class Solution {
    public boolean isPalindrome(String s) {
        
        if(s==null || s.length()==0)return false;

        String tailoredStr= s.replaceAll("\\s"," ");

        char[] c = tailoredStr.toCharArray();

        int left=0,right=c.length-1;

        while(left<right){

            if(!Character.isLetterOrDigit(c[left])){
                left++;
            }
            else if(!Character.isLetterOrDigit(c[right])){
                right--;
            }
            else {
                if(Character.toLowerCase(c[left]) != Character.toLowerCase(c[right])){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
        
    }
}
