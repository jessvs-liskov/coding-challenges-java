package booleans;

public class AtLeastOneTrue {
    public static void main(String[] args) {
        System.out.println("At least one is true? " + ((execute(false, false)) ? "Yes" : "No"));
    }

    public static boolean execute(boolean firstValue, boolean secondValue) {
        return firstValue || secondValue;
    }
}
