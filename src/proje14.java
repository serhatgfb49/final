import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class proje14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("İlk tarihi giriniz (GG-AA-YYYY): ");
        String tarih1Str = scanner.nextLine();
        LocalDate tarih1 = parseTarih(tarih1Str);


        System.out.print("İkinci tarihi giriniz (GG-AA-YYYY): ");
        String tarih2Str = scanner.nextLine();
        LocalDate tarih2 = parseTarih(tarih2Str);


        long gunFarki = ChronoUnit.DAYS.between(tarih1, tarih2);
        long ayFarki = ChronoUnit.MONTHS.between(tarih1, tarih2);
        long yilFarki = ChronoUnit.YEARS.between(tarih1, tarih2);


        System.out.println("Tarih Farkı: ");
        System.out.println("Gün: " + gunFarki);
        System.out.println("Ay: " + ayFarki);
        System.out.println("Yıl: " + yilFarki);
    }


    private static LocalDate parseTarih(String tarihStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(tarihStr, formatter);
    }
}

