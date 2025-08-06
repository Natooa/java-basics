package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {
        String text = "apple java apple python c++ sql java java apple apple";
        Map<String, Integer> mostReapedWord = new HashMap<>();
        String[] words = text.split(" ");
        for(String word : words) {
            if(mostReapedWord.containsKey(word)) {
                int count = mostReapedWord.get(word);
                mostReapedWord.put(word, count + 1);
            } else {
                mostReapedWord.put(word, 1);
            }
        }

        String mostReaped = null;
        int maxCount = 0;
        for(Map.Entry<String, Integer> entry : mostReapedWord.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostReaped = entry.getKey();
            }
        }

        System.out.println(mostReaped);
        System.out.println(maxCount);

    }
}
