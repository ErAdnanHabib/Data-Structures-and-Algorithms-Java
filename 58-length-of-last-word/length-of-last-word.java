class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr= s.split(" ");
        int len=arr.length-1;
        return arr[len].length();
        
        
        
        

    }
}