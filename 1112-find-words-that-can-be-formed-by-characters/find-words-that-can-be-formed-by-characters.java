class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum=0;

        int hash1[] = new int[26];
        for(char ch:chars.toCharArray()){
            hash1[ch-'a']++;
        }
        for(String word:words){
            int hash2[]=new int[26];

            for(int i=0;i<word.length();i++){
                hash2[word.charAt(i)-'a']++;
            }
            boolean flag=true;
            for(int i=0;i<26;i++){
                if(hash1[i]<hash2[i]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                sum+=word.length();
            }
        }
        return sum;
    }
}