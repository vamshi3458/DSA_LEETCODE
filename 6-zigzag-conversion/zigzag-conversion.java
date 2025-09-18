class Solution {
    public String convert(String s, int numRows) {
        
        int n = s.length();
        String ans="";
        String arr[] = new String[numRows];
        int i=0;
        for(i=0;i<numRows;i++){
            arr[i]="";
        }
        i=0;
        while(i<s.length()){
        for(int index=0;index<arr.length&&i<s.length();index++){
            arr[index]+=s.charAt(i++);
        }
        for(int index=numRows-2;index>0&&i<s.length();index--){
            arr[index]+=s.charAt(i++);
        }
        // String ans="";
        }
        for(String str:arr){
            ans+=str;
        }
        return ans;
    }
}