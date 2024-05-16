class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map= new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
               char char_pop=stack.size()!=0?stack.pop():'#';
                if(char_pop!=map.get(ch))return false;
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty(); 
    }
}