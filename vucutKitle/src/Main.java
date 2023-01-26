import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kilo;
        double vki, boy;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = girdi.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = girdi.nextInt();
        vki = ((double) kilo / (boy * boy));
        System.out.println("\nVücut Kitle İndeksiniz: " + vki);
    }
}