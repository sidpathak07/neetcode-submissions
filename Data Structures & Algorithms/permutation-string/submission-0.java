class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        if(s1.length()>s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int left=0,right=0;
        while(right<s1.length()){
            freq2[s2.charAt(right)-'a']++;
            right++;
        }
        if(Arrays.equals(freq1,freq2)){
                return true;
        }
        while(right<s2.length()){          
            freq2[s2.charAt(left)-'a']--;
            left++;
            freq2[s2.charAt(right)-'a']++;
            right++;
            if(Arrays.equals(freq1,freq2)){
                return true;
            }
        }
        return false;
    }
}
