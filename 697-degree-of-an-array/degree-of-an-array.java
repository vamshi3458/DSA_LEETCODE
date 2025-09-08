class Solution {
    public int findShortestSubArray(int[] nums) {

        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }   
        List<Integer> temp = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int key:map.keySet()){
            maxi = Math.max(maxi,map.get(key));
        }
        for(int key:map.keySet()){
            if(map.get(key)==maxi){
                temp.add(key);
            }
        }
        System.out.println(temp);
        List<Integer> temp2 = new ArrayList<>();
        for(int num:nums){
            temp2.add(num);
        }
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<temp.size();i++){
            int first=temp2.indexOf(temp.get(i));
            int second = temp2.lastIndexOf(temp.get(i));
            System.out.println(first+" "+second);
                mini=Math.min(mini,second-first+1);
        }
        return mini;
    }
}