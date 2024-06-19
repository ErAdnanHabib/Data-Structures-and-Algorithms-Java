class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        Stack<String> stack=new Stack<>();
        String newStr=new String();
        for(int i=0;i<words.length;i++){
            if(!words[i].isEmpty()){
                stack.push(words[i]);
            } 
        }
        while(!stack.isEmpty()){
            newStr += stack.pop() + " " ;
        }
        return newStr.trim();
        
    }
}