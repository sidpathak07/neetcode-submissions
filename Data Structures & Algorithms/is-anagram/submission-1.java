class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = true;
        HashMap<Character,Integer> charMap = new HashMap<>();
        if (s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++){
            if(charMap.containsKey(s.charAt(i))){
                charMap.put(s.charAt(i),charMap.get(s.charAt(i))+1);
            }else{
                charMap.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!charMap.containsKey(t.charAt(i)) || charMap.get(t.charAt(i))<=0){
                isAnagram = false;
                break;
            }
            
            charMap.put(t.charAt(i),charMap.get(t.charAt(i))-1);
        }
        for (int count : charMap.values()) {
            if (count != 0) {
                return false;
            }
        }
        return isAnagram;
    }
}
