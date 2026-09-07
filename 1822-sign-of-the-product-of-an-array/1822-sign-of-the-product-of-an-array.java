class Solution {
    public int arraySign(int[] nums) {
        int n=0;

        for(int i:nums){
            if(i==0){
                return 0;
            }
            if(i<0){
                n++;
            }
        }
        if(n%2==0){
            return 1;
        }
        else{
            return -1;
        }
    }
}