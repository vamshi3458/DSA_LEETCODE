class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int hash1[] = new int[26];
        int cnt=0;
        for(int i=0;i<allowed.length();i++){
            hash1[allowed.charAt(i)-'a']++;
        }
        for(String word:words){
            boolean flag=true;
            for(int i=0;i<word.length();i++){
                if(hash1[word.charAt(i)-'a']==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true) cnt++;
        }
        return cnt;
    }
}