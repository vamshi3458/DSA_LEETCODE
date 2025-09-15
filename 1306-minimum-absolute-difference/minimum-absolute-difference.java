class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
                min=Math.min(min,Math.abs(arr[i]-arr[i-1]));
        }
        for(int i=1;i<arr.length;i++){
                if(Math.abs(arr[i]-arr[i-1])==min){
                    List<Integer> inner = new ArrayList<>();
                    inner.add(arr[i-1]);
                    inner.add(arr[i]);
                    ans.add(inner);
                }
        }
        return ans;
    }
}