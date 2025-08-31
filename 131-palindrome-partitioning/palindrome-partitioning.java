class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        backtrack(0,s,res,path);

        return res;
    }
    public void backtrack(int indx,String s,List<List<String>> res,List<String> path){
        if(s.length()==indx){
            res.add(new ArrayList<>(path));
        }
        for(int i=indx;i<s.length();i++){
            if(isPalindrome(s,indx,i)){
                path.add(s.substring(indx,i+1));
                backtrack(i+1,s,res,path);
                path.remove(path.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}