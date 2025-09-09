class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long dp[] = new long[n+1];
        long mod = (long)1e9+7;
        long ans=0;
        long noofsharing=0;

        dp[1]=1;
        for(int i=2;i<=n;i++){
            long noofnew = dp[Math.max(i-delay,0)];
            long noofforget=dp[Math.max(i-forget,0)];

            noofsharing+=(noofnew-noofforget+mod)%mod;
            dp[i]=noofsharing;
        }

        for(int i=n-forget+1;i<=n;i++){
            ans=(ans+dp[i])%mod;
        }
        return (int)ans;
    }
}