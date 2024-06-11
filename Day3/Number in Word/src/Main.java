public class Main {
    public static void main(String[] args) {
        printNumberInWord(7);
    }

    public static void printNumberInWord(int number) {
        String result = switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4, 5, 6, 7, 8, 9 -> "4 to 9\nActually it is " + number;
            default -> "Unexpected Value " + number;
        };
        System.out.println(result);
    }
}
