import java.util.Scanner;

public class proje6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enBuyukSayi = Integer.MIN_VALUE;
        int girilmeSirasi = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Lütfen " + i + ". sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi > enBuyukSayi) {
                enBuyukSayi = sayi;
                girilmeSirasi = i;
            }
        }

        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("Girildiği sıra: " + girilmeSirasi);

        scanner.close();
    }
}

