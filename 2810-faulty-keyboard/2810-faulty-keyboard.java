class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);

            if(a=='i'){
                sb.reverse();
            }
            else{
                sb.append(a);
            }
        }
        return sb.toString();

    }
}
