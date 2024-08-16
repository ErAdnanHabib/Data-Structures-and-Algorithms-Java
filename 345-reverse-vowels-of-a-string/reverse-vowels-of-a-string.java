class Solution {
    public String reverseVowels(String s) {
        
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;

        while(left<right){
            while(left < right && !vowels(arr[left])){
                left++;
            }
            while(left < right && !vowels(arr[right])){
                right--;
            }
            if(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp; 
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    private boolean vowels(char ch){
        ch = Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}