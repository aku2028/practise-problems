public class SmallestCheck {
    public static void main(String[] args) {

        int number1 = 10;  // example values
        int number2 = 20;
        int number3 = 30;

        boolean isSmallest = (number1 < number2) && (number1 < number3);

        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}