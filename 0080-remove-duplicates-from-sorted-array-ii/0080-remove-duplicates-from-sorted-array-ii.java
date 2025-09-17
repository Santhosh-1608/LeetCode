class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            // to check whether the num  is present more than twice
            // since it is sorted current and before previous is checked ( i and i -2 )
            if(idx < 2 || nums[i] != nums[idx-2])
            nums[idx++] = nums[i];
        }
        return idx;
    }
}