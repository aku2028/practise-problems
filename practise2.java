public class KmToMiles {
    public static void main(String[] args) {
        
        // Given distance in kilometers
        double km = 10.8;
        
        // Conversion factor (as provided)
        double conversionFactor = 1.6; // 1 km = 1.6 miles
        
        // Convert kilometers to miles
        double miles = km * conversionFactor;
        
        // Display result
        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}