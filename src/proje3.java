import java.util.Scanner;

public class proje3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yapmak istediğiniz işlemi seçin:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        int secim = scanner.nextInt();

        System.out.print("Lütfen ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("Lütfen ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        double sonuc = 0;

        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                break;
            case 4:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata: Bölen sıfır olamaz!");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçimi!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}

