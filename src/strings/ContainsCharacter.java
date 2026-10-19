package strings;

public class ContainsCharacter {
    public static void main(String[] args) {
        System.out.println(execute("Hello World!", "Papa"));
    }

    public static boolean execute(String text, String character) {
        return text.contains(character);
    }
}
