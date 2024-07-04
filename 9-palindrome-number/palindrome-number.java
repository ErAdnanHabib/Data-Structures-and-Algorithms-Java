class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder str=new StringBuilder();
        str.append(x);
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }  return true; 
    }
}