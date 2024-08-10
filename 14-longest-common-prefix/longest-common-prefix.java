class Solution {
    public String longestCommonPrefix(String[] strs) {

        int mini = Integer.MAX_VALUE;

        for(String str : strs){
            mini = Math.min(mini , str.length());
        }
        StringBuilder sbtr = new StringBuilder();
        for(int i = 0 ; i < mini ; i++){
            char ch = strs[0].charAt(i);
            for(int j=1 ; j < strs.length ; j++){
                if(ch!=strs[j].charAt(i)){
                    return sbtr.toString();
                }
            }
            sbtr.append(ch);
        }
        return sbtr.toString();
    }
}