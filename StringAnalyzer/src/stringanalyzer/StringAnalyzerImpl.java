package stringanalyzer;

import java.util.Set;

public class StringAnalyzerImpl implements StringAnalyzer {
    private static final Set<String> VOWELS = Set.of("a", "e", "i", "o", "u");
    private static final Set<String> CONSONANTS = Set.of("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z");

    @Override
    public int calculateWords(String text) {
        String[] words = text.trim().split("\\s+");
        int words_count = 0;
        for(String word : words) {
            if(!word.matches("\\d+")) {
                words_count++;
            }
        }
        System.out.println("Number of words: " + words_count);
        return words_count;
    }

    @Override
    public int calculateSymbol(String text) {
        int symbols_count = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != ' ' && text.charAt(i) != '\n') {
                symbols_count++;
            }
        }
        System.out.println("Number of symbols: " + symbols_count);
        return symbols_count;
    }

    @Override
    public int calculateVowelAndConsonants(String text){
        int vowels_count = 0;
        int consonants_count = 0;
        for(int i = 0; i < text.length(); i++) {
            if(VOWELS.contains(String.valueOf(text.charAt(i)))) {
                vowels_count++;
            }
            if(CONSONANTS.contains(String.valueOf(text.charAt(i)))) {
                consonants_count++;
            }
        }
        System.out.println("Vowels: " + vowels_count);
        System.out.println("Consonants: " + consonants_count);
        return vowels_count + consonants_count;
    }

    //parseEmail
    @Override
    public String parseEmail(String text) {
        char c1, c2;
        int flag = 0;
        StringBuilder email = new StringBuilder();
        StringBuilder name = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
            c1 = text.charAt(i);
            if(c1 == '@') {
                name.append(text.substring(flag, i));
                flag = i + 1;
                for(int j = i + 1; j < text.length(); j++) {
                    c2 = text.charAt(j);
                    if(c2 == '.') {
                        email.append(text.substring(flag, j));
                        flag = j + 1;
                        System.out.println("Email: " + email.toString() + " name: " + name.toString());
                        email.delete(0, email.length());
                        name.delete(0, name.length());
                        int nextStart = j + 1;
                        while(nextStart < text.length() && text.charAt(nextStart) != ' ') {
                            nextStart++;
                        }
                        flag = nextStart + 1;
                        break;
                    }
                }
            }
        }
        return text;
    }
}
