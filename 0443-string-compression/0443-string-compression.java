class Solution {
    public int compress(char[] chars) {
        int left=0;
        int right=0;
        while(right< chars.length){
            char current= chars[right];
            int count=0;
            while(right< chars.length && chars[right]==current){
                right++;
                count++;
            }
            chars[left++]= current;

            if(count>1){
                for (char c: String.valueOf(count).toCharArray()){
                    chars[left++]=c;
                }
            }
        }
         return left;
    }

}
