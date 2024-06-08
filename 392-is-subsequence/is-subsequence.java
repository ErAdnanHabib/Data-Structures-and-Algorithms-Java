class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean answer=false;
        Queue<Character> queue=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            queue.add(s.charAt(i));
        }
        for(int i=0 ; i<t.length() && !queue.isEmpty() ; i++){
            if(queue.peek() == t.charAt(i))queue.poll();
        }
        return queue.isEmpty();
    }
}