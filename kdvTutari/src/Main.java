import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvTutari, kdvliTutari, kdvOrani, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();
        if (tutar>1000){
            kdvOrani = 0.08;
            kdvTutari = tutar * kdvOrani;
            kdvliTutari = tutar + kdvTutari;
            System.out.println(kdvliTutari);
        }
        else {
            double kdvTutar = tutar * kdvOran;
            double kdvliTutar = tutar + kdvTutar;
            System.out.println(kdvliTutar);
        }
    }
}