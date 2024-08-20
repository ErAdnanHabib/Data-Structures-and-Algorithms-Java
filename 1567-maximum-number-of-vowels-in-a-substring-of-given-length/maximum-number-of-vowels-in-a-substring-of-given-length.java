class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i = 0 ; i < k ; i++){
            char ch = s.charAt(i);
            if(booly(ch)){
                count++;
            }
        }

        int temp = count;

        for(int i = k ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(booly(ch)){
                temp++;
            }
            if(booly(s.charAt(i-k))){
                temp--;
            }
            count = Math.max(count , temp);
        }
        return count;
    }

    private boolean booly(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}