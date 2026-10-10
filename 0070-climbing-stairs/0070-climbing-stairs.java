class Solution {
    public int climbStairs(int n) {
        // if (n==0 || n==1){
        //     return 1;
        // }
        
        // return climbStairs(n-1)+climbStairs(n-2);
        int a=1;
        int b=1;

    for(int i=0;i<n;i++){
        int c=a+b;
        a=b;
        b=c;
    }
    return a;
    }
}