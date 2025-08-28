class Solution {
    public int[] finalPrices(int[] a) {
        // int n = a.length;

         int n = a.length;
        int nse[] = new int[n];
        int ans[] = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty()&&a[i]<stk.peek()){
                stk.pop();
            }
            if(stk.isEmpty())
                nse[i]=-1;
            else
                nse[i]=stk.peek();
            stk.push(a[i]);
        }
        for(int i=0;i<a.length;i++){
            if(nse[i]==-1){
                ans[i]=a[i];
            }else
            ans[i]=a[i]-nse[i];
        }
        return ans;
    }
}