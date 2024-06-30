class Solution {
    public int calculate(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        StringBuilder str=new StringBuilder(s);
        int ans=0;
        int digit=0; 
        int sign=1;
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                digit=digit * 10 + (ch - '0');
            }else if(ch=='+'){
                ans+=sign * digit;
                sign=1;
                digit=0;
            }else if(ch=='-'){
                ans+=sign * digit;
                sign=-1;
                digit=0;
            }else if(ch=='('){
                stack.push(ans);
                stack.push(sign);
                ans=0;
                sign=1;
            }else if(ch==')'){
                ans+=sign*digit;
                digit=0;
                int prevSign=stack.pop();
                int prevDigit=stack.pop();
                ans=prevDigit+ prevSign*ans;
            }
        }ans+=sign * digit;
        return ans;
        
    }
}