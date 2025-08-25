class Solution {
    public int trap(int[] a) {
        int n = a.length;
        int ans=0;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = a[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],a[i]);
        }
        suffix[n-1] = a[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],a[i]);
        }
        for(int i=0;i<n;i++){
            int leftmax=prefix[i];
            int rightmax=suffix[i];

            if(a[i]<leftmax&&a[i]<rightmax){
                 ans+= Math.min(leftmax,rightmax)-a[i];
            }
        }
        return ans;
    }
}