class Solution {
    public int smallestAbsent(int[] nums) {
        int sum=0;
        HashSet<Integer> set=new HashSet<>();

        for(int i:nums){
            sum+=i;
            set.add(i);
        }
        int ans=1;
        while(ans*(long)nums.length<=sum ||set.contains(ans)){
            ans++;
        }
        return ans;
    }
}
