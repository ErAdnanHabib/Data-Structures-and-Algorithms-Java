class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Integer[] array = map.values().toArray(new Integer[0]);
        Set<Integer> set = new HashSet<>();

        for(int num : array){
            if(!set.add(num)){
                return false;
            }
        }return true;
    }
}