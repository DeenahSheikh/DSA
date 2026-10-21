class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int diff=nums[i]-nums[(i+1)%nums.length];

            if(diff<0){
                diff=-diff;
            }
            if(diff>max){
                max=diff;
            }
        }
        return max;
    }
}