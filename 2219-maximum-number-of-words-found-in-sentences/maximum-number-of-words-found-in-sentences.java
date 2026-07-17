class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            // Splitting by space gives an array of words
            int currentLength = sentence.split(" ").length;
            maxWords = Math.max(maxWords, currentLength);
        }
        return maxWords;
    }
}
