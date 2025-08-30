class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        List<List<Integer>> ans = new ArrayList<>();

        func(0,ans,arr,t,new ArrayList<>());
        return ans;
    }
    public void func(int indx,List<List<Integer>> ans,int arr[],int t,List<Integer> ds){
        int n = arr.length;
        if(indx==n){
            if(t==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[indx]<=t){
            ds.add(arr[indx]);
            func(indx,ans,arr,t-arr[indx],ds);
            ds.remove(ds.size()-1);
        }
        func(indx+1,ans,arr,t,ds);
    }
}