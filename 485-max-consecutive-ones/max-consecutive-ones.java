class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

            int n = nums.length;
            int max_cnt=0;
            int cnt=0;
            for(int i=0;i<n;i++){
                if(nums[i]==1){
                    cnt++;
                    max_cnt = Math.max(max_cnt,cnt);
                }else if(nums[i]==0){
                    cnt=0;
                }
            }
            return max_cnt;
    }
}