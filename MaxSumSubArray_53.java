public class MaxSumSubArray_53 {
    public static int  maxSubArray(int[] nums) {
        int currentSum = 0; 
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            currentSum += nums[i];
            maxSum = Math.max(currentSum,maxSum);
            if(currentSum <0)
            {
                currentSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {-2,-1,-3,4,-1,2,1,5,4};
       int maxSum = maxSubArray(nums);
       System.out.println(maxSum);
    }
}
