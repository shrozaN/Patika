import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double toplam, armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        armutKilo = girdi.nextDouble();
        System.out.println("Elma Kaç Kilo ? :");
        elmaKilo = girdi.nextDouble();
        System.out.println("Domates Kaç Kilo ? :");
        domatesKilo = girdi.nextDouble();
        System.out.println("Muz Kaç Kilo ? :");
        muzKilo = girdi.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? :");
        patlicanKilo = girdi.nextDouble();

        toplam = (armutFiyat*armutKilo) + (elmaFiyat*elmaKilo) + (domatesFiyat*domatesKilo) + (muzFiyat*muzKilo) + (patlicanFiyat*patlicanKilo);
        System.out.println("\nToplam Tutar : " + toplam + " TL");
    }
}