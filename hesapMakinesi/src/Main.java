import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int dortIslem;
        int sayi1, sayi2;
        Scanner girdi = new Scanner(System.in);
        System.out.println("1.Sayıyı giriniz: ");
        sayi1 = girdi.nextInt();
        System.out.println("2.Sayıyı giriniz: ");
        sayi2 = girdi.nextInt();
        System.out.println("\nYapmak istediğiniz işlemi seçiniz: ");
        System.out.println("\nToplamak için 1'e basınız.");
        System.out.println("Çıkartmak için 2'ye basınız.");
        System.out.println("Çarpmak için 3'e basınız.");
        System.out.println("Bölmek için 4'e basınız.\n");
        dortIslem = girdi.nextInt();
        switch (dortIslem){
            case 1:
                System.out.println("\nİşlem sonucu = " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("\nİşlem sonucu = " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("\nİşlem sonucu = " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("\nİşlem sonucu = " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("\nTanımlı olmayan tuş!");
                break;
        }
    }
}