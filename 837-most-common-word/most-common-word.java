class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String[] words = paragraph.toLowerCase().split("[ !?',;\\.]+");

        Set<String> set = new HashSet<>();

        for(String ban : banned){
            set.add(ban.toLowerCase());
        }

        HashMap<String,Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        String ans = null;

        for(String word : words){

            if(!set.contains(word)){
                map.put(word , map.getOrDefault(word , 0)+1);

                if(map.get(word) > max){
                    max = map.get(word);
                    ans = word;
                }
            }
        }return ans;
        
    }
}