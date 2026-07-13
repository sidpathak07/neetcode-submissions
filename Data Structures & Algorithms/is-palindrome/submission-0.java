class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int st=0,e=str.length()-1;
        while(st<=e){
            if(!(str.charAt(st) == str.charAt(e))){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}
