class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int pre[] = new int[n];
        int suff[] = new int[n];
        int res[] = new int[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]*nums[i];
        }
        suff[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]*nums[i];
        }
        // res[0]=
        for(int i=0;i<n;i++){
            if(i==0){
                res[i]=1*suff[i+1];
            }else if(i==n-1){
                res[i]=pre[i-1]*1;
            }else
            res[i]=pre[i-1]*suff[i+1];
        }
    return res;
    }
}