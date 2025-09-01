class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int max=0;
        int pre[] = new int[n+1];
        pre[0]=0;
        int k=0;
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1]+gain[k++];
        }
        System.out.print(Arrays.toString(pre));
        for(int i=0;i<pre.length;i++){
            max = Math.max(pre[i],max);
        }
        return max;
    }
}