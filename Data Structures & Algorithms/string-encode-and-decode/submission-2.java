class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length()+"#"+strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> st = new ArrayList<>();
        while(i<str.length()){
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i)!='#'){
                sb.append(str.charAt(i));
                i++;
            }
            int len = Integer.parseInt(sb.toString());
            int count = 0;
            i+=1;
            sb = new StringBuilder();
            while(count<len){
                sb.append(str.charAt(i));
                i++;
                count++;
            }
            st.add(sb.toString());
        }
        return st;
    }
}
