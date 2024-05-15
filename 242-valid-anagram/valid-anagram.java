class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] map =new int[26];
        for(int i=0;i<s.length();i++){

            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            map[ch1-'a']++;
            map[ch2-'a']--;
        }
        for(int i=0;i<map.length;i++){
            if(map[i]!=0)return false;
        }return true;
        
    }
}