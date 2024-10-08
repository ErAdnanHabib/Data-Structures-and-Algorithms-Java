class Solution {
    public int countPrefixes(String[] words, String s) {

        int count=0;
        StringBuilder sb = new StringBuilder(s);
        for(String word : words){
            int temp = s.indexOf(word);
            if(temp==0){
                count++;
            }
        }
        return count;
    }
}