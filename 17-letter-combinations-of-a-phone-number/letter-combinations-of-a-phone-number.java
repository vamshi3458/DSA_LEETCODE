class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        List<String> ph = Arrays.asList("abc","def","ghi","jkl","mno","pqrs","tuv","wxyz");

        if(digits.equals("")) return ans;
        backtrack(0,digits,ph,"",ans);
        return ans;
    }
    public void backtrack(int i,String digits,List<String> ph,String s,List<String> ans){
        if(i==digits.length()){
            ans.add(s);
            return;
        }
        int num=digits.charAt(i)-'0'-2;
        for(int j=0;j<ph.get(num).length();j++){
           backtrack(i+1,digits,ph,s+ph.get(num).charAt(j),ans);
        }
    }
}