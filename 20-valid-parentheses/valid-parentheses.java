class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] st = new char[n];
        int ptr = -1;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(')
                st[++ptr] = ch;
            else{
                if(ptr < 0)
                    return false;
                if(ch == ')' && st[ptr] != '(')
                    return false;
                else if(ch == ']' && st[ptr] != '[')
                    return false;
                else if(ch == '}' && st[ptr] != '{')
                    return false;
                ptr--;
            }
        }
        return ptr == -1;
    }
}