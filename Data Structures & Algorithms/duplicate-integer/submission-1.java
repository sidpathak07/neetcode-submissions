class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        boolean hasDup = false;
        for(int i=0;i<nums.length;i++){
            if(numSet.contains(nums[i])){
                hasDup = true;
            }
            numSet.add(nums[i]);
        }
        return hasDup;
    }
}