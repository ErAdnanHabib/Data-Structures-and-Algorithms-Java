class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> set = new HashSet<>();
        int count=0;
        for(char ch : jewels.toCharArray()){
            set.add(ch);
        }

        for(char stone : stones.toCharArray()){
            if(set.contains(stone)){
                count++;
            }
        }
        return count;
        
    }
}