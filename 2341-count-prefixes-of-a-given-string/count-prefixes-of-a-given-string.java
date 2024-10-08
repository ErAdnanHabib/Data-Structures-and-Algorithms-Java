class Solution {
    public int countPrefixes(String[] words, String s) {

        int count=0;
        StringBuilder sb = new StringBuilder(s);
        for(String word : words){
            if(s.indexOf(word)==0){
                count++;
            }
        }
        return count;
    }
}