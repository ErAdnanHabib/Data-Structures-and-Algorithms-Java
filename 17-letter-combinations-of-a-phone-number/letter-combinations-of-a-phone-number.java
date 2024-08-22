class Solution {
    public List<String> letterCombinations(String digits) {

        if(digits == null || digits.length() == 0){
            return new ArrayList<>();
        }
        
        HashMap<Character , String> map = new HashMap<>();
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4' , "ghi");
        map.put('5' , "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");

        List<String> result = new ArrayList<>();
        backtrack(result , "" , digits , map);
        return result;

    }

    private void backtrack(List<String> result , String current , String nextDigits , HashMap<Character , String> map){

        if(nextDigits.length()==0){
            result.add(current);
        }else{
            String letters = map.get(nextDigits.charAt(0));
            for(char ch : letters.toCharArray()){
                backtrack(result , current + ch , nextDigits.substring(1) , map);
            }
        }
    }
}