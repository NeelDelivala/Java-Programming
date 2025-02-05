import java.util.Scanner;

public class CurrencyExchange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in USD: ");
        double usdAmount = scanner.nextDouble();

        double exchangeRate = 87;
        double inrAmount = usdAmount * exchangeRate;

        System.out.println("\nConverted amount in INR (double format): " + inrAmount);

        int roundedInrAmount = (int) inrAmount;
        System.out.println("Converted amount in INR (rounded to int format): " + roundedInrAmount);

        byte byteValue = 10;
        int intValue = byteValue;
        double doubleValue = intValue;

        System.out.println("\nWidening conversions:");
        System.out.println("Byte value: " + byteValue + " → Int value: " + intValue + " → Double value: " + doubleValue);

        double anotherDoubleValue = 25.75;
        int anotherIntValue = (int) anotherDoubleValue; 
        byte anotherByteValue = (byte) anotherIntValue; 

        System.out.println("\nNarrowing conversions:");
        System.out.println("Double value: " + anotherDoubleValue + " → Int value: " + anotherIntValue + " → Byte value: " + anotherByteValue);

        scanner.close();
    }
}
