class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashSet<Character> set = new HashSet<>();
        int max = 0;
        int st = 0,e=0;
        while(e<s.length()){
            if(set.contains(s.charAt(e))){
                while(s.charAt(st)!=s.charAt(e)){
                    set.remove(s.charAt(st));
                    st++;
                }
                set.remove(s.charAt(st));
                st++;
            }else{
                set.add(s.charAt(e));
                e++;
                if((e-st)>max){
                max = e-st;
                }
            }
        }
        return max;
    }
}
