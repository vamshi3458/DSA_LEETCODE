class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        
        int res[] = new int[2];
        int width=0;
        int new_line=1;
        for(char ch:s.toCharArray()){
            int char_width = widths[ch-'a'];
            if(width+char_width>100){
                new_line++;
                width=0;
            }
            width+=char_width;
        }
        return new int[]{new_line,width};
    }
}