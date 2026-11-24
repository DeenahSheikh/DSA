class Solution {
    public int maxLength(int[] nums) {
        int max = 2;
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                if (gcd(product, nums[j]) != 1) {
                    break;
                }
                product *= nums[j];
                max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}