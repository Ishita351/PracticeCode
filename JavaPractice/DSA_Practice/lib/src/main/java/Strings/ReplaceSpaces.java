package Strings;

// replace spaces " " of a string with "%20"

public class ReplaceSpaces{
    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0;
        // Step 1: Count spaces
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        // Step 2: Calculate final index
        int index = trueLength + spaceCount * 2;
        /*   each space has only 1 character but %20 has 3 characters .
             therefore we multiply the spacecount by 2    */
        // Step 3: Edit string in reverse
        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
    public static void main(String[] args) {
        String input = "Mr John Smith    ";
        int trueLength = 13;
        char[] chars = input.toCharArray();
        replaceSpaces(chars, trueLength);
        System.out.println("\"" + new String(chars) + "\"");
    }
}

