class Solution {
    public int canBeTypedWords(String text, String broken) {
        String words[] = text.split(" ");
        int cnt = 0;
        for(String word:words){
            boolean ischeck=true;
            for(int i=0;i<broken.length();i++){
                char ch = broken.charAt(i);
                if(word.contains(String.valueOf(ch))){
                    ischeck=false;
                    break;
                }
            }
            if(ischeck) cnt++;
        }
        return cnt;
    }
}