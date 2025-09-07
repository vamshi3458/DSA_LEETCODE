class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1=s.length();
        int n2 = t.length();
        HashSet<Character> s1 = new HashSet<>();
        HashSet<Character> s2 = new HashSet<>();
        for(char ch:s.toCharArray()){
            s1.add(ch);
        }
        for(char ch:t.toCharArray()){
            s2.add(ch);
        }
        if(s1.size()!=s2.size()) return false;
        if(n1!=n2)return false;
        Map<Character,Character> map = new HashMap<>();
        int i=0,j=0;
        while(i<n1&&j<n2){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(j));
                i++;
                j++;
            }else{
                if(t.charAt(j)!=map.get(s.charAt(i))){
                    return false;
                }else{
                    i++;
                    j++;
                }
            }
        }
        return true;
    }
}