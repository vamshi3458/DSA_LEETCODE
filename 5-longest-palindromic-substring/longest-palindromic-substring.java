class Solution {
    public String longestPalindrome(String s) {
        
        int n = s.length();
        if(n<=1) return s;
        String ans = "";
        //odd length i=1;j=1 same position
        for(int i=1;i<s.length();i++){
            int low=i;
            int high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            
            if(low==-1||high>=s.length()) break;
            }
            String str = s.substring(low+1,high);
            if(ans.length()<str.length()){
                ans=str;
            }
        //even length i=0;j=1
            low=i-1;
            high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            
            if(low==-1||high>=s.length()) break;
            }
            String strr  = s.substring(low+1,high);
            if(ans.length()<strr.length()){
                ans=strr;
            }
        }
        return ans;
    }
}