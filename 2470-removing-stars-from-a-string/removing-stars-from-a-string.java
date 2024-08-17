class Solution {
    public String removeStars(String s) {

        StringBuilder str = new StringBuilder(s);

        int i=0;
        int j=1;
        while(j <= str.length()-1){
            if(str.charAt(j) == '*'){
                str.deleteCharAt(j);
                str.deleteCharAt(i);
                j=i;
                i--;
            }else{
                i++;
                j++;
            }
        }return str.toString();
    }
}