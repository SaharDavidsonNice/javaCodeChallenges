import java.util.Scanner;

public class WaterBill {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many gallons of water " + "did you use this month?");
        double usage = scanner.nextDouble();
        System.out.println("your water bill is: " + calculateWaterBill(usage) + "$");
    }

    public static double calculateWaterBill(double gallonUsage) {
       double waterGallonCost = 9.42;
       double minimumWaterCharge = 18.84;
       double oneCcfInGallons = 748;
       double extraChargePerAdditionalCharge = 3.90;
       if(gallonUsage <= 2)
       { return minimumWaterCharge;
       } else {
           double extra = gallonUsage -2;
           double extraVolume = (extra * waterGallonCost) + (extra * extraChargePerAdditionalCharge);
           return minimumWaterCharge + extraVolume ;
       }
    }
}
