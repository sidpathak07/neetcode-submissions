class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st=0,e=numbers.length-1;
        int[] arr = new int[2];
        while(st<e){
            if((numbers[st]+numbers[e])==target){
                arr[0] = st+1;
                arr[1] = e+1;
                return arr;
            } 
            if(numbers[st]+numbers[e]<target){
                st++;
            }else{
                e--;
            }   
        }
        return arr;
    }
}
