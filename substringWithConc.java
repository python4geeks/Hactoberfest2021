class Solution {
    public static List<Integer> findSubstring(String s, String[] words) {
      int n = s.length();
        int k = words.length;
        int wordLength = words[0].length();
        int substringSize = wordLength * k;
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < wordLength; i++) {
            HashMap<String, Integer> wordMap = new HashMap<>(wordCount);
            int right = i,  left = i;
            int wordUsed = 0;
            while (right <= n - wordLength) {
                String sub = s.substring(right, right + wordLength);
                if(left < right){
                    while ( left < right && ((wordMap.containsKey(sub) && wordMap.get(sub) <= 0) || !wordMap.containsKey(sub) || right - left == substringSize)) {
                        String leftSub = s.substring(left, left + wordLength);
                        if (wordMap.containsKey(leftSub)) {
                            wordMap.put(leftSub, wordMap.get(leftSub) + 1);
                            wordUsed--;
                        }
                        left = left + wordLength;
                    }
                }
                if (wordMap.containsKey(sub) && wordMap.get(sub) > 0) {
                    wordMap.put(sub, wordMap.get(sub) - 1);
                    wordUsed++;
                }
                right = right + wordLength;
                if (wordUsed == k) {
                    arr.add(left);
                }
            }
        }
        return arr;
    }
}
