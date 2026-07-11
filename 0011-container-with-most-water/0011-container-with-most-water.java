class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxx=0;

        while(right>left){
            int area=Math.min(height[left],height[right])*(right-left);
            maxx=Math.max(maxx,area);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return maxx}}