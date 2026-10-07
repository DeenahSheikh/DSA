class Solution {
    public int arrangeCoins(int n) {
       int x=0;
       int i=1;
        while(n>=i){
            x++;
            n-=i;
            i++;
        }
        return x;
    }
}