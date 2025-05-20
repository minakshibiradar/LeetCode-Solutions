

class Solution {
    public int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int res = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // Store current max before updating it
            int tempMax = currMax;

            currMax = Math.max(num, Math.max(num * currMax, num * currMin));
            currMin = Math.min(num, Math.min(num * tempMax, num * currMin));

            res = Math.max(res, currMax);
        }
        
        return res;
    }
}
