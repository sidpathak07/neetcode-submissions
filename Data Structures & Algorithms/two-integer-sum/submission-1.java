class Solution {
    public int[] twoSum(int[] nums, int target) {
        int k=0;
        int l=0;
        HashMap<Integer,Integer> intMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(intMap.containsKey(target-nums[i])){
                k = i;
                l = intMap.get(target-nums[i]);
            }
            intMap.put(nums[i],i);
        }
        int[] intArr = new int[2];
        intArr[0]=l;
        intArr[1]=k;
        return intArr;
    }
}
