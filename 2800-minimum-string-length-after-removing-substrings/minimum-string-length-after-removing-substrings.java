class Solution {
    public int minLength(String s) {
        int n=s.length();

        char[] stack=new char[n];
        int top=-1;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(top==-1){
                stack[++top]=ch;
                continue;
            }
            if(ch=='B' && stack[top]=='A') top--;
            else if(ch=='D' && stack[top]=='C') top--;
            else stack[++top]=ch;

        }

        return top+1;
    }
}