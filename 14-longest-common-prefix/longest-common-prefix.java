class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n_min=Integer.MAX_VALUE;
        for(String st:strs){
            n_min=Math.min(st.length(),n_min);
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<n_min;i++){
            char currChar=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=currChar){
                    return s.toString();
                }
            }
            s.append(currChar);
        }
        return s.toString();
        
    }
}