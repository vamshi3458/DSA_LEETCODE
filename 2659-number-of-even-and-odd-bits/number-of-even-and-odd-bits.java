class Solution {
    public int[] evenOddBit(int n) {
        String str = Integer.toBinaryString(n);
        int ans[] = new int[2];
        int ecnt=0;
        int ocnt=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                int back=str.length()-1-i;
                if(back%2==0) ecnt++;
                else
                ocnt++;
            }
        }
        ans[0]=ecnt;
        ans[1]=ocnt;
        return ans;
    }
}