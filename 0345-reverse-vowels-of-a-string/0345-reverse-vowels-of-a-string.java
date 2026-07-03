class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;

        while(right>left){
            if("aeiouAEIOU".indexOf(arr[left])==-1){
                left++;
                continue;
            }
            if("aeiouAEIOU".indexOf(arr[right])==-1){
                right--;
                continue;
            }

            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;


        }
        return new String(arr);
            }
}