public class HeightConverter {
    public static void main(String[] args) {

        double height = 170;   // height in centimeters (example value)

        // Convert cm to total inches
        double totalInches = height / 2.54;

        // Convert to feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches - (feet * 12);

        System.out.println("Your Height in cm is " + height +
                " while in feet is " + feet +
                " and inches is " + inches);
    }
}