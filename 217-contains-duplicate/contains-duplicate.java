class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }
        if(nums.length!=set.size()){
            return true;
        }
        return false;
    }
}