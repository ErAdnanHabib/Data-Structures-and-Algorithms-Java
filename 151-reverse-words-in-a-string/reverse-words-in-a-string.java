class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        String str=new String();
        for(int i=words.length-1 ; i>=0 ; i--){
            if(!words[i].isEmpty()){
                str+=words[i] + " ";
            }
        }return str.trim();      
    }
}