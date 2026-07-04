class Solution {
    public boolean isPalindrome(int n) {
    if(n<0) return false;
    int originalN=n;
    int newN= 0;
    while(n>0){
      int lastDigit=n%10;
      newN=(newN*10)+lastDigit;
      n=n/10;
    }
    return originalN==newN;
    }
}