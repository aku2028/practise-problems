public class PrimeCheck {
    public static void main(String[] args) {

        int number = 29;   // example number
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;   // not prime, exit loop
                }
            }
        }

        System.out.println("Is the number " + number + " a prime number? " + isPrime);
    }
}