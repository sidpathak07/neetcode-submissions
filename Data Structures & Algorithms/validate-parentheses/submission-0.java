class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }else{
            if(st.size()==0) return false;
            else if(s.charAt(i)==')' && st.size()>0 && st.peek()!='(') return false;
            else if(s.charAt(i)==']' && st.size()>0 && st.peek()!='[') return false;
            else if(s.charAt(i)=='}' && st.size()>0 && st.peek()!='{') return false;
            else st.pop();
            }
            i++;
        }
        if(st.size()>0) return false;
        return true;
    }
}
