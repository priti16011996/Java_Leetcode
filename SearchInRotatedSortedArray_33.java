public class SearchInRotatedSortedArray_33 {
    public static int search(int[] nums, int target) {
        return searchInRotatedArray(nums,target,0,nums.length-1);
    }

    public static int searchInRotatedArray(int[]nums,int target, int start, int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = start+(end-start)/2;
        if(nums[mid] == target)
        {
            return mid;
        }

        if(nums[mid] >= nums[start])
        {
            if(target >= nums[start] && target <= nums[mid])
            {
                 return searchInRotatedArray(nums, target, start, mid-1);
            }
            else
            {
                return searchInRotatedArray(nums, target, mid+1, end);
            }
        }
        else
        {
            if(target >= nums[mid+1] && target <= nums[end])
            {
                return searchInRotatedArray(nums, target, mid+1, end);
            }
            else
            {
                return searchInRotatedArray(nums, target, start, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
    
}
