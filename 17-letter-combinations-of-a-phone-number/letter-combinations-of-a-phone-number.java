class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();

        backtrack(result, new StringBuilder(), digits, letters);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, String nextDigits, String[] letters) {
        if (nextDigits.length() == 0) {
            result.add(current.toString());
        } else {
            String letterOptions = letters[nextDigits.charAt(0) - '0'];
            for (char letter : letterOptions.toCharArray()) {
                current.append(letter);
                backtrack(result, current, nextDigits.substring(1), letters);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }
}