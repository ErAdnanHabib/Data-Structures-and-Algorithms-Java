class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int count=0;
        for(char jewel : jewels.toCharArray()){
            for(char stone : stones.toCharArray()){
                if(jewel==stone){
                    count++;
                }
            }
        }
        return count;  
    }
}

// Set<Character> set = new HashSet<>();
        // int count=0;
        // for(char ch : jewels.toCharArray()){
        //     set.add(ch);
        // }

        // for(char stone : stones.toCharArray()){
        //     if(set.contains(stone)){
        //         count++;
        //     }
        // }
        // return count;