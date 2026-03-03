public class EarthVolume {
    public static void main(String[] args) {

        double radiusKm = 6378;          // Radius of Earth in kilometers
        double pi = Math.PI;

        // Volume formula: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert cubic kilometers to cubic miles
        // 1 mile = 1.6 km  →  1 km = 1/1.6 miles
        // So for cubic conversion: divide by (1.6^3)
        double volumeMiles3 = volumeKm3 / Math.pow(1.6, 3);

        System.out.println("The volume of earth in cubic kilometers is " 
                + volumeKm3 + 
                " and cubic miles is " + volumeMiles3);
    }
}