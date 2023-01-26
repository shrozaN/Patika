import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        matematik = girdi.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = girdi.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = girdi.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = girdi.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = girdi.nextInt();

        double ortalama = (matematik+fizik+turkce+kimya+muzik)/5;

        if (ortalama>101 || ortalama<0){
            System.out.println("\nYanlış not/notlar girdiniz!");
        }
        else if (ortalama>=0 && ortalama <= 55){
            System.out.println("\nSınıfta kaldınız.");
        } else {
            System.out.println("\nSınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız : " + ortalama);
    }
}