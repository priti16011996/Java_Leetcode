import java.util.*;
public class TwoSum_167 {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end = numbers.length-1;
        while(start<end)
        {
            if(numbers[start]+numbers[end] == target)
            {
                return new int[]{start+1,end+1};
            }
            if(numbers[start]+numbers[end] < target)
            {
                start++;
            }
            if(numbers[start]+numbers[end] > target)
            {
                end--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSum_167 obj = new TwoSum_167();
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = obj.twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
