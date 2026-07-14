class Solution {
    public boolean validate(int[] freq1,int[] freq2){
        for(int i=0;i<128;i++){
            if(freq1[i]<freq2[i]){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int[] freq1 = new int[128];
        int[] freq2 = new int[128];

        for(int i=0;i<t.length();i++){
            freq2[t.charAt(i)]++;
        }
        String str = "";
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        while(right<s.length()){
            freq1[s.charAt(right)]++;
            right++;
            while(validate(freq1,freq2)){
                if(minLen>right-left){
                    minLen = right-left;
                    str = s.substring(left,right);
                }
                freq1[s.charAt(left)]--;
                left++;
            }
        }
        return str;
    }
}
