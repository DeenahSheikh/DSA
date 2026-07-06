class Solution {
    public boolean isPalindrome(int x) {
        
        String abc=String.valueOf(x);
        int left=0;
        int right=abc.length()-1;

        while(right>left){
            if(abc.charAt(left)!=abc.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}