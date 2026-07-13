class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int s = i+1;
            int e = nums.length-1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while(s<e){
                int sum = nums[i]+nums[s]+nums[e];
                if(sum==0){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[s]);
                    l.add(nums[e]);
                    li.add(l);
                    s++;
                    e--;
                    while (s < e && nums[s] == nums[s - 1]) {
                        s++;
                    }

                    while (s < e && nums[e] == nums[e + 1]) {
                        e--;
                    }
                }else if(sum<0){
                    s++;
                }else{
                    e--;
                }
                
            }
        }
        return li;
    }
}
