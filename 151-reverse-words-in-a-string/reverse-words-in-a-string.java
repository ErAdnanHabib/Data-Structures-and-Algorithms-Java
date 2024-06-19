class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder newStr = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) { // Skip empty strings due to multiple spaces
                newStr.append(words[i]).append(" ");
            }
        }
        
        // Remove the trailing space
        if (newStr.length() > 0) {
            newStr.setLength(newStr.length() - 1);
        }
        
        return newStr.toString();
    }
}
