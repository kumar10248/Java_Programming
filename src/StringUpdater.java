public class StringUpdater {
    public static String updateString(String input) {
        StringBuilder updatedString = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                updatedString.append((char) ((c - 'a' + 1) % 26 + 'a'));
            } else if (Character.isUpperCase(c)) {
                updatedString.append((char) ((c - 'A' - 1 + 26) % 26 + 'A'));
            } else {
                updatedString.append(c);
            }
        }

        return updatedString.toString();
    }

    public static void main(String[] args) {
        String originalString = "bDcF";
        String result = updateString(originalString);
        System.out.println(result);
    }
}
