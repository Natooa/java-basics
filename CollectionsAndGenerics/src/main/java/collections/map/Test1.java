package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        String text = "python java c++ java python java";
        String[] words = text.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for(String word : words) {
            if(wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);

            } else {
                wordCount.put(word, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
