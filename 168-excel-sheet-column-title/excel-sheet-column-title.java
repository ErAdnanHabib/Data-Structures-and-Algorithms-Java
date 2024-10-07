class Solution {
    public String convertToTitle(int columnNumber) {

        char arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        int n = columnNumber;
        StringBuilder str = new StringBuilder();
        while(n > 0){
            n--;
            int remainder  = n % 26;       
            str.insert(0 , arr[remainder]);
            n /= 26;
        }
        return str.toString(); 
    }
}