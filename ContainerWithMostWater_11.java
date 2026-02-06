public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int heightx = Math.min(height[left], height[right]);
            int width = right - left;
            int area = heightx * width;

            maxWater = Math.max(maxWater, area);

            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
