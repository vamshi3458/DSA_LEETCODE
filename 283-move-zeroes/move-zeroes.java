class Solution {
    public void moveZeroes(int[] nums) {

     int n = nums.length;
     
     int b[] = new int[n];
     int j=0;
     for(int i=0;i<n;i++){
        if(nums[i]!=0){
            b[j]=nums[i];
            j++;
        }else{
            continue;
        }
     }
     for(int i=0;i<b.length;i++){
        nums[i] = b[i];
     }

    }
}