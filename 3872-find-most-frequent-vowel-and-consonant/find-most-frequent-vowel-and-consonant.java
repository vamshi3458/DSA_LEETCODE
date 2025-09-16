class Solution {
    public int maxFreqSum(String s) {
        int hash1[] = new int[26];
        int hash2[] = new int[26];

        for(int i=0;i<s.length();i++){
             if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
            hash1[s.charAt(i)-'a']++;
        }
       for(int num:hash1){
            System.out.println(num);
       }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u')
            hash2[s.charAt(i)-'a']++;
        }
       
    int maxi1 = Integer.MIN_VALUE;
    int maxi2 = Integer.MIN_VALUE;
    for(int i=0;i<26;i++){
        maxi1=Math.max(maxi1,hash1[i]);
        maxi2=Math.max(maxi2,hash2[i]);
    }
    System.out.println(maxi1+" "+maxi2);
    return maxi1+maxi2;
    }
}