class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("");
        for (char digit : digits.toCharArray()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                for (char letter : letters[digit - '0'].toCharArray()) {
                    queue.add(current + letter);
                }
            }
        }

        result.addAll(queue);
        return result;
    }
}