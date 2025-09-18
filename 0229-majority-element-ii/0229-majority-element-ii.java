class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])) mp.put(nums[i],mp.get(nums[i]) + 1);
            else mp.put(nums[i],1);
            if(mp.get(nums[i]) > Math.floor(nums.length / 3) && !ans.contains(nums[i])) ans.add(nums[i]);
        }
        return ans;
    }
}