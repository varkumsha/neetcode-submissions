class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] sCharacter =s.toCharArray();
        char[] tCharacter = t.toCharArray();
         Arrays.sort(sCharacter);
         Arrays.sort(tCharacter);

        for(int i=0;i<=sCharacter.length-1;i++){
            if(sCharacter[i]!=tCharacter[i]){
                return false;
            }
        }
        return true;
    }
}
