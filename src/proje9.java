import java.util.Scanner;

public class proje9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ondalık sayıyı girin: ");
        double decimalNumber = scanner.nextDouble();


        String binaryNumber = convertDecimalToBinary(decimalNumber);


        System.out.println("İkilik sayı: " + binaryNumber);


        scanner.close();
    }


    public static String convertDecimalToBinary(double decimalNumber) {

        long integerPart = (long) decimalNumber;
        double fractionalPart = decimalNumber - integerPart;


        String binaryIntegerPart = Long.toBinaryString(integerPart);


        StringBuilder binaryFractionalPart = new StringBuilder(".");
        while (fractionalPart > 0) {

            fractionalPart *= 2;
            int bit = (int) fractionalPart;
            binaryFractionalPart.append(bit);


            fractionalPart -= bit;
        }


        return binaryIntegerPart + binaryFractionalPart.toString();
    }
}

