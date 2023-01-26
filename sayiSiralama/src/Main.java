import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;
        Scanner girdi = new Scanner(System.in);
        System.out.println("1.Sayıyı Giriniz: ");
        sayi1 = girdi.nextInt();
        System.out.println("2.Sayıyı Giriniz: ");
        sayi2 = girdi.nextInt();
        System.out.println("3.Sayıyı Giriniz: ");
        sayi3 = girdi.nextInt();

        if (sayi1>sayi2 && sayi1>sayi3){
            if (sayi2 > sayi3){
                System.out.println("Küçükten büyüğe sıralama = " + sayi3 + " " + sayi2 + " " + sayi1);
            }else {
                System.out.println("Küçükten büyüğe sıralama = " + sayi2 + " " + sayi3 + " " + sayi1);
            }
        }
        else if (sayi2>sayi1 && sayi2>sayi3){
            if (sayi1>sayi3){
                System.out.println("Küçükten büyüğe sıralama = " + sayi3 + " " + sayi1 + " " + sayi2);
            }
            else {
                System.out.println("Küçükten büyüğe sıralama = " + sayi1 + " " + sayi3 + " " + sayi2);
            }
        }
        else {
            if (sayi1>sayi2){
                System.out.println("Küçükten büyüğe sıralama = " + sayi2 + " " + sayi1 + " " + sayi3);
            }
            else {
                System.out.println("Küçükten büyüğe sıralama = " + sayi1 + " " + sayi2 + " " + sayi3);
            }
        }
    }
}