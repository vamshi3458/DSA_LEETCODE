class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<n1;i++){
            boolean flag=true;
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j])
                {
                    flag=false;
                    break;
                }  // else list1.add(nums1[j]);
            }
            if(flag==true&&!list1.contains(nums1[i])){
                list1.add(nums1[i]);
            }
        }
        for(int i=0;i<n2;i++){
            boolean flag=true;
            for(int j=0;j<n1;j++){
                if(nums2[i]==nums1[j]){
                    flag=false;
                    break;
                }
                // else list2.add(nums2[j]);
            }
            if(flag==true&&!list2.contains(nums2[i])){
                list2.add(nums2[i]);
            }
        }
        outer.add(list1);
        outer.add(list2);
    return outer;
    }
}