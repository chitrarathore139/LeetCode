class Solution {
public:
    int subtractProductAndSum(int n) {
       int sum=0;
        int temp=n;
        while(n>0){
            sum=sum+ (n%10);
            n=n/10;
        }
        int product=1;
        while(temp>0){
            product= product* (temp%10);
            temp=temp/10;
        }
        return product-sum; 
    }
};