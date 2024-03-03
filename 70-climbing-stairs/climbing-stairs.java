class Solution {
    
public int climbStairs(int n) {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..\
    int a=1,b=1;
    
    for(int i=2;i<=n;i++){
        int c=a+b;
        b=a;
        a=c;
    }
    return a;
}}
    