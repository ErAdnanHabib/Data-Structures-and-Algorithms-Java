class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder str=new StringBuilder();
        str.append(x);
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            char ch1=str.charAt(left);
            char ch2=str.charAt(right);
            if(ch1!=ch2){
                return false;
            }
            left++;
            right--;
        }  return true; 
    }
}