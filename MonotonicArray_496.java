public class MonotonicArray_496 {
    public boolean isMonotonic(int[] nums) {
        boolean monotonicInc = true;
        boolean monotonicDec = true;

        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i] > nums[i+1])
            {
                monotonicInc= false;
            }
            else if(nums[i] < nums[i+1])
            {
                monotonicDec= false;
            }
        }
        return monotonicDec || monotonicInc;
    }
}
