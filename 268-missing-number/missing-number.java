class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int total_sum = 0;
        int sum = 0;

        for(int i=1;i<=n;i++){
            total_sum += i;
        }

        for(int i=0;i<n;i++){
            sum += nums[i];
        }

        return total_sum - sum;
    }
}