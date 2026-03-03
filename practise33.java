public class MultiplesBelow100 {
    public static void main(String[] args) {

        int number = 12;   // example number

        if (number > 0 && number < 100) {

            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Number must be a positive integer less than 100.");
        }
    }
}