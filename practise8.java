public class FeeDiscountCalculator {
    public static void main(String[] args) {

        double fee = 125000;          // example fee
        double discountPercent = 10;  // example discount

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}
