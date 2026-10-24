class Solution {
    public int longestValidParentheses(String s) {
        Deque<Integer> st=new ArrayDeque<>();
        st.push(-1);
        int ans=0;
        if(s.length()<=1){
        return ans;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
            st.push(i);
        }
        else{
            st.pop();
            if(st.isEmpty()){
                st.push(i);
            }
            else{
                ans=Math.max(ans,i-st.peek());
            }
        }
    }return ans;
    }
}