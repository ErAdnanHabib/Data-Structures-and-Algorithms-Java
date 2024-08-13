class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map =new HashMap<>();
        for(String str:strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String tmp  = new String(arr);
            if(!map.containsKey(tmp)){
                map.put(tmp ,new ArrayList<>());
            }
            map.get(tmp).add(str);
        }return new ArrayList<>(map.values());
    }
}