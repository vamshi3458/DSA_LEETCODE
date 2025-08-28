class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> stk = new Stack<>();
        int n = num.length();
        for(char ch:num.toCharArray()){
            
            while(!stk.isEmpty()&&stk.peek()>ch&&k>0){
                    stk.pop();
                    k--;
            }
            stk.push(ch);
        }
            while(k>0&&!stk.isEmpty()){
                stk.pop();
                k--;
            }
            StringBuilder s = new StringBuilder();

            while(!stk.isEmpty()){
                s.append(stk.peek());

                stk.pop();
            }
            s.reverse();

            while(s.length()>0&&s.charAt(0)=='0'){
                s.deleteCharAt(0);
            }
            return s.length()>0?s.toString():"0";
    }
}