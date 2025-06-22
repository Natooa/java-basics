package stringanalyzer;

public interface StringAnalyzer {
    public int calculateWords(String text);

    public int calculateSymbol(String text);

    public int calculateVowelAndConsonants(String text);

    public String parseEmail(String text);

}
