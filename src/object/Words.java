package object;

import constant.Regex;

public class Words {

    private String word;
    private String pronunciation;
    private String classify;
    private String meaning;
    private String[] specialized;

    public Words() {
        this.word = "";
        this.pronunciation = "";
        this.classify = "";
        this.meaning = "";
    }

    public Words(String word, String pronunciation, String classify, String meaning, String[] specialized) {
        this.word = word;
        this.pronunciation = pronunciation;
        this.classify = classify;
        this.meaning = meaning;
        this.specialized = specialized;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String[] getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String[] specialized) {
        this.specialized = specialized;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    @Override
    public String toString() {
        String lineSpecialized = "";
        if (specialized != null) {
            for (String element : specialized) {
                lineSpecialized += Regex.BLACK_SLASH_N + Regex.AT + element;
            }
        }
        return word + Regex.TAB + Regex.AT + word + Regex.SPACE + Regex.FORWARD_SLASH + pronunciation + Regex.FORWARD_SLASH + Regex.BLACK_SLASH_N + Regex.ASTERISK + Regex.SPACE + Regex.SPACE + classify + meaning + lineSpecialized;
    }
}
