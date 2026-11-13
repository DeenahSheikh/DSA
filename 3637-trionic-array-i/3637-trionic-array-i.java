class Solution {
    public boolean isTrionic(int[] nums) {
        int i= 0;
        int n= nums.length;

        while(i + 1< n && nums[i]< nums[i + 1]){
            i++;
        }
        if (i == 0) {
            return false;
        }
        int a = i;
        while(i + 1 <n && nums[i]>nums[i + 1]){
            i++;
        }
        if(i==a){
            return false;
        }
        int b= i;
        while(i+1< n && nums[i]<nums[i + 1]){
            i++;
        }
        return i> b  && i==n - 1;
    }
}