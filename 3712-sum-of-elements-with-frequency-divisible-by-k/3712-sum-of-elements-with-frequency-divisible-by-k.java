class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int sum=0;
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
        
            }
            else{
                map.put(i,1);
            }
        }

        for(int i:nums){
            if(map.get(i)%k==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}