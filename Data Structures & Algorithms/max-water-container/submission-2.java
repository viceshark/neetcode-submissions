class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length-1;

        int max = Integer.MIN_VALUE;


        while(left<right){

           max = Math.max(max, (right - left)*Math.min(heights[right],heights[left])); 

            if(heights[left]>heights[right]){
                right--;
            }
            else left++;

        }

        return max;
    }
}
