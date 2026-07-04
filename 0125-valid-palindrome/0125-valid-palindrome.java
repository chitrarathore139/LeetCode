class Solution {

    public static boolean palindrome(String s,int low,int high){
        // Base case
        if (low >= high)
            return true;
        // Characters don't match
        if (s.charAt(low) != s.charAt(high))
            return false;
        // Check remaining substring
        return palindrome(s, low + 1, high - 1);
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\W", ""); 
        s = s.replaceAll("_", ""); 
        s = s.toLowerCase();
        int low= 0;
        int high=s.length()-1;
        return palindrome(s,low,high);
    }
}