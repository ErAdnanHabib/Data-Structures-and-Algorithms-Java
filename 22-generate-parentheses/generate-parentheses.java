class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        recursive("" , 0 , 0 , n , ans);
        return ans;
    }
    private void recursive(String curr , int open , int close , int total , List<String> ans){
        if(curr.length()==2*total){
            ans.add(curr);
            return;
        }
        if(open < total){
            recursive(curr +"(" , open+1 , close , total , ans);
        }
        if(close < open){
            recursive(curr + ")" , open , close+1 , total , ans);
        }
    }
}