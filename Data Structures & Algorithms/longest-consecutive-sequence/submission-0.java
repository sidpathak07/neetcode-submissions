class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
        }
        int max = 0;
        for(Integer i:hs){
            if(!hs.contains(i-1)){ //number should be start of the sequence. if previous number is present then not considered.
                int current = i;
                int len = 1;
                while(hs.contains(current+1)){
                    current++;
                    len++;
                }
                if(max<len){
                    max = len;
                }
            }
        }
        return max;
    }
}
