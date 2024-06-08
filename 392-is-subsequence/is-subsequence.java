class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0; // Pointer for 's'
        
        // Iterate through 't' and 's' simultaneously
        for (int i = 0; i < t.length() && sIndex < s.length(); i++) {
            // If current character in 't' matches character in 's', move to next character in 's'
            if (t.charAt(i) == s.charAt(sIndex)) {
                sIndex++;
            }
        }
        
        // If we have consumed all characters in 's', it is a subsequence of 't'
        return sIndex == s.length();
    }}
