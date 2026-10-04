class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:friends){
            set.add(i);
        }

        int[] result=new int[friends.length];
        int count=0;

        for(int i:order){
            if(set.contains(i)){
                result[count]=i;
                count++;
            }
        }
        return result;
    }
}