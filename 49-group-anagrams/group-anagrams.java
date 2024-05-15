class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        for(String str:strs){
            char[] ch_array=str.toCharArray();
            Arrays.sort(ch_array);
            String tmp= new String(ch_array);
            if(!map.containsKey(tmp)){
                map.put(tmp,new ArrayList<>());
            }
            map.get(tmp).add(str);
        }
        return new ArrayList<>(map.values());    
    }
}