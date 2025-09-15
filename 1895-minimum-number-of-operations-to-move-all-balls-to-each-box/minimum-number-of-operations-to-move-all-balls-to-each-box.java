class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        // int sum=0;
        int a1[] = new int[n];
        int a2[] = new int[n];
        int a3[] = new int[n];
        int i=0,j=0;
        for(i=0;i<n;i++){
            int sum=0;
            for(j=i;j<n;j++){
                if(boxes.charAt(j)=='1'){
                    sum+=Math.abs(j-i);
                }
            }
            a1[i]=sum;
        }
        for(i=n-1;i>=0;i--){
            int sum=0;
            for(j=i;j>=0;j--){
                if(boxes.charAt(j)=='1'){
                    sum+=Math.abs(j-i);
                }
            }
            a2[i]=sum;
        }
        for(int k=0;k<n;k++){
            a3[k]=a1[k]+a2[k];
        }
        return a3;
    }
}