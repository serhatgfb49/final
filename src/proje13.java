import java.util.Scanner;

public class proje13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin kenar uzunluklarını giriniz:");

        System.out.print("1. Kenar: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("2. Kenar: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("3. Kenar: ");
        double kenar3 = scanner.nextDouble();

        if (ucgenKontrol(kenar1, kenar2, kenar3)) {
            System.out.println("Bu kenar uzunluklarıyla bir üçgen oluşturulabilir.");

            if (eskenarKontrol(kenar1, kenar2, kenar3)) {
                System.out.println("Bu üçgen eşkenar bir üçgendir.");
            } else if (ikizkenarKontrol(kenar1, kenar2, kenar3)) {
                System.out.println("Bu üçgen ikizkenar bir üçgendir.");
            } else if (dikKenarKontrol(kenar1, kenar2, kenar3)) {
                System.out.println("Bu üçgen dik kenar bir üçgendir.");
            } else {
                System.out.println("Bu üçgen normal bir üçgendir.");
            }
        } else {
            System.out.println("Bu kenar uzunluklarıyla bir üçgen oluşturulamaz.");
        }

        scanner.close();
    }

    public static boolean ucgenKontrol(double kenar1, double kenar2, double kenar3) {
        return (kenar1 + kenar2 > kenar3) && (kenar1 + kenar3 > kenar2) && (kenar2 + kenar3 > kenar1);
    }

    public static boolean eskenarKontrol(double kenar1, double kenar2, double kenar3) {
        return (kenar1 == kenar2) && (kenar2 == kenar3);
    }

    public static boolean ikizkenarKontrol(double kenar1, double kenar2, double kenar3) {
        return (kenar1 == kenar2) || (kenar1 == kenar3) || (kenar2 == kenar3);
    }

    public static boolean dikKenarKontrol(double kenar1, double kenar2, double kenar3) {
        double[] kenarlar = { kenar1, kenar2, kenar3 };
        // Kenar uzunluklarını küçükten büyüğe sırala
        java.util.Arrays.sort(kenarlar);

        // Pisagor Teoremi'ni kullanarak dik üçgen kontrolü
        return (kenarlar[0] * kenarlar[0] + kenarlar[1] * kenarlar[1] == kenarlar[2] * kenarlar[2]);
    }
}

