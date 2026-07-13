class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int s = 0,e=heights.length-1;
        while(s<e){
            int area = (e-s)*Math.min(heights[s],heights[e]);
            if(area>max){
                max=area;
            }
            if(heights[s]<heights[e]){
                s++;
            }else{
                e--;
            }
        }
        return max;
    }
}
