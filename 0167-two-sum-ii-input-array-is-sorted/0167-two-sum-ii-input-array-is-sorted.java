class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;

        while(right>left){
            int summ=numbers[left]+numbers[right];
            if(summ==target){
                return new int[] {left+1,right+1};
            }
            if(summ<target){
                left++;
            }
            if(summ>target){
                right--;
            }
        }
        return new int[] {};
    }
}