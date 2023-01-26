import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        // Scanner fonksiyonunu tanımlama
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz: ");
        a = girdi.nextInt();
        System.out.println("2. Kenarı Giriniz: ");
        b = girdi.nextInt();
        c = (int)Math.sqrt((a*a) + (b*b));
        System.out.println("\nHipotenüs = " + c);
    }
}