class Solution {
    public int maxSubArray(int[] nums) {

     int j=0;
     int n =  nums.length;
     int sum=0;
     int maxi = Integer.MIN_VALUE;
     while(j<n){
        sum+=nums[j];
        maxi = Math.max(maxi,sum);

        if(sum<=0)
            sum=0;
    j++;
     }


     return  maxi;

    }
}