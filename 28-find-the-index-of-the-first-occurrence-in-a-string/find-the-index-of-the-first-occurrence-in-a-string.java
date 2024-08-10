class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder str = new StringBuilder(haystack);
        int index = str.indexOf(needle);
        return index;
        
    }
}