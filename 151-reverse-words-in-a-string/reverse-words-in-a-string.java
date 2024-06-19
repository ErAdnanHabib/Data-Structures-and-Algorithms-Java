class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder newStr=new StringBuilder();
        for(int i=words.length-1 ; i>=0 ; i--){
            if(!words[i].isEmpty()){
                newStr.append(words[i]).append(" ");
            } 
        }
        newStr.setLength(newStr.length() - 1);
        return newStr.toString();
     
    }
}