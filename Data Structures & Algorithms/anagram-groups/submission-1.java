class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s:strs){
            char[] ch = new char[26];
            for(char c:s.toCharArray()){
                ch[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append("#"+ch[i]);
            }
            String str = sb.toString();
            if(map.containsKey(str)){
                map.get(str).add(s);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(str, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
