public class CountDigits {
    public static void main(String[] args) {

        // a. Get integer input from command line
        int number = Integer.parseInt(args[0]);

        // b. Initialize count
        int count = 0;

        // Handle zero separately
        if (number == 0) {
            count = 1;
        } else {
            // Convert negative to positive
            if (number < 0) {
                number = -number;
            }

            // c. Loop until number != 0
            while (number != 0) {
                // d. Remove last digit
                number = number / 10;

                // e. Increase count
                count++;
            }
        }

        // f. Display result
        System.out.println("Number of digits: " + count);
    }
}