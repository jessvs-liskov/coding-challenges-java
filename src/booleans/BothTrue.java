package booleans;

public class BothTrue {
    public static void main(String[] args) {
        System.out.println("Both true? " + ((execute(true, true)) ? "Yes" : "No"));
    }

    public static boolean execute(boolean firstValue, boolean secondValue) {
        return firstValue && secondValue;
    }
}
