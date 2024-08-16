class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        List<List<Integer>> arrList = new ArrayList<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        List<Integer> list1 = new ArrayList<>(set1);
        list1.removeAll(set2);
        arrList.add(list1);

        List<Integer> list2 = new ArrayList<>(set2);
        list2.removeAll(set1);
        arrList.add(list2);
        return arrList;
    }
}