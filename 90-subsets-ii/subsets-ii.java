class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0,nums,ans,new ArrayList<>());

        return ans;

    }
    public void backtrack(int indx,int nums[],List<List<Integer>> ans,List<Integer> ds){
        ans.add(new ArrayList<>(ds));

        for(int i=indx;i<nums.length;i++){
            if(i!=indx&&nums[i]==nums[i-1]) continue;

            ds.add(nums[i]);
            backtrack(i+1,nums,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}