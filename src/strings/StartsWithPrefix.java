package strings;

public class StartsWithPrefix {
    public static void main(String[] args) {
        String text = "Hello World";
        String prefix = "hello";

        System.out.println(execute(text, prefix));
    }

    public static boolean execute(String text, String prefix) {
        if (prefix.length() > text.length()) return false;

        for (int i = 0; i < prefix.length(); i++) {
            if (text.charAt(i) != prefix.charAt(i)) return false;
        }

        return true;
    }
}
