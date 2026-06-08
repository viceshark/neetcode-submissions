class Solution {
    public void rotate(int[] nums, int k) {

        int left = 0;
        int right = nums.length - 1;
        k = k % nums.length;

        while(left < right){
            int buff= nums[left];
            nums[left] = nums[right];
            nums[right] = buff;
            left++;
            right--;
        }

        left = 0;
        right = k-1;
        while(left < right){
            int buff= nums[left];
            nums[left] = nums[right];
            nums[right] =buff;
            left++;
            right--;
        }

        left = k;
        right = nums.length-1;
        while(left < right){
            int buff= nums[left];
            nums[left] = nums[right];
            nums[right] = buff;
            left++;
            right--;
        }
        
    }
}