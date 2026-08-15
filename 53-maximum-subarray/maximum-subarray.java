class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        
        int current_max=nums[0];
        int max_so_far=nums[0];
        for(int i=1;i<n;i++){
            current_max=Math.max(nums[i],nums[i]+current_max);
            max_so_far = Math.max(max_so_far,current_max);
        }

        return max_so_far;
    }
}