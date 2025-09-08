class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int min=m;
        int mini=n;
        for(int i=0;i<ops.length;i++){
            min=Math.min(ops[i][0],min);
            mini=Math.min(ops[i][1],mini);
        }
        return min*mini;
    }
}