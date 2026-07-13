class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int left=0;
        int right=tokens.length-1;

        int s=0;
        int ms=0;

        while(right>=left){
            if(power>= tokens[left]){
                power-=tokens[left];
                s++;
                ms=Math.max(s,ms);
                left++;
            }
            else if(s>0){
                power+=tokens[right];
                s--;
                right--;
            }
            else{
                break;
            }
        }
        return ms;
    }
}