public class DivisibleByFive {
    public static void main(String[] args) {

        int number = 25;  // Example number

        boolean isDivisible = (number % 5 == 0);

        System.out.println("Is the number " + number +
                " divisible by 5? " + isDivisible);
    }
}