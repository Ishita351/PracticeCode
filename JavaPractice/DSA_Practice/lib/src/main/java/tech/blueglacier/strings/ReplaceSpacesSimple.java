package tech.blueglacier.strings;

public class ReplaceSpacesSimple {
    public static String replaceSpaces(String str) {

        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == ' ') {
                result.append("%20");
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Mr John Smith";
        String output = replaceSpaces(input);
        System.out.println(output);
    }
}

