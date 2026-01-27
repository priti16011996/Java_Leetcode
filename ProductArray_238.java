public class ProductArray_238 {
    public int[] productExceptSelf(int[] nums) { 
        int n= nums.length;
        int prefixArr[] = new int[n];
        int prefix =1;

        for(int i=0; i<n; i++)
        {
            prefixArr[i] = prefix;
            prefix *= nums[i];
        }

        int suffixArr[] = new int[n];
        int suffix=1;

        for(int i=n-1; i>=0; i--)
        {
            suffixArr[i] = suffix;
            suffix *= nums[i];
        }
        
        int OutputArr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            OutputArr[i] =suffixArr[i]*prefixArr[i];
        }
        return OutputArr;
    }
}
