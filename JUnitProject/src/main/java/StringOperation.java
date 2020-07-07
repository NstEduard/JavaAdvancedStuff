public class StringOperation {
    public int stringLength(String text) {
        return text.length();
    }

    public String stringConcatenation(String text1, String text2) {
        return text1.concat(text2);
    }

    public Boolean stringContains(String text1, String text2) {
        if (text1.contains(text2)) {
            return true;
        } else return false;
    }
}
