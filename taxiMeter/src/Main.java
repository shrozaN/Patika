import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* 
        Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
        */
        int acilis=10, gidilecekKM;
        double km = 2.20, tutar;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Kaç KM gideceğinizi yazınız: ");
        gidilecekKM = girdi.nextInt();
        tutar = (gidilecekKM * km) + acilis;
        if (tutar<20){
            int odenecek = 20;
            System.out.println("\nToplam Ödemeniz Gereken Tutar = " + odenecek);
        }
        else {
            System.out.println("\nToplam Ödemeniz Gereken Tutar = " + tutar);
        }
    }
}