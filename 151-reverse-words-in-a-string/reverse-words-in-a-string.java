class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sbtr = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=0 ; i<words.length ; i++){
            if(!words[i].isEmpty()){
                stack.push(words[i]);
            }
        }
        while(!stack.isEmpty()){
            sbtr.append(stack.pop()+ " ");
        }
        String str = sbtr.toString();
        return str.trim();

    }
}