class Solution {
    public int tribonacci(int n) {
        if(n==0)return 0;
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i=3 ; i <= n ; i++){
            int sum = a+b+c;
            a = b;
            b = c;
            c = sum;
        }
        return c;
    }
}