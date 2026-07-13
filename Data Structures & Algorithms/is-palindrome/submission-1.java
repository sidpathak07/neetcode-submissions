class Solution {
    public boolean isPalindrome(String s) {
        //String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int st=0,e=s.length()-1;
        while(st<=e){
            if(!Character.isLetterOrDigit(s.charAt(st))){
                st++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(e))){
                e--;
            }else if(Character.toLowerCase(s.charAt(st))
                    == Character.toLowerCase(s.charAt(e))){
                st++;
                e--;
            }else{
                return false;
            }

        }
        return true;
    }
}
