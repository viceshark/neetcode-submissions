class Solution {
    public int findMin(int[] nums) {
        
        //Понять где точка свертывания
        // От точки свертывания идем вправо, там будет минимум.
        // Если не свернуто, то берем самый левый
        int low = 0;
        int high = nums.length - 1;
        

        while (low<high){
            int mid = low  + (high - low) / 2;
             if( nums[mid] > nums[high]){
                low = mid+1;
             }
             else{
                high = mid;
             }
        }
        return nums[low];
    }
}
