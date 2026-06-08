class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;

        for(int i = 0; i<numbers.length; i++){
            int curr = numbers[left] + numbers[right];
            
            if(curr == target){
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }
            else if (curr > target){
                right--;
            }
            else if (curr < target){
                left++;
            }
        }
        return result;
    }
}
