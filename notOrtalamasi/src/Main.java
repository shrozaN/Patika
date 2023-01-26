import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfını tanımlama
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.println("Müzik notunuz: ");
        muzik = inp.nextInt();

        int ortalama = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = ortalama/6;

        System.out.println("\nOrtalama = " + sonuc);

        if (sonuc>60){
            System.out.println("Sınıfı Geçti");
        }
        else {
            System.out.println("Sınıfta Kaldı");
        }
    }
}