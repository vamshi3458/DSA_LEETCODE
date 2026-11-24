class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int n = nums.length;

        int positiveIndex = 0;
        int negativeIndex = 1 ;

        int res[] = new int[n];

        for(int value:nums)
        {
            if(value>0)
            {
                res[positiveIndex] = value;
                positiveIndex+=2;
            }
            else
            {
                res[negativeIndex] = value;
                negativeIndex+=2;
            }
        }
        return res;
    }
}