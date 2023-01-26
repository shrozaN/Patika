import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;

        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360
        */
        int r, dilimAcisi;
        double pi = 3.14;
        double formula;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz: ");
        r = girdi.nextInt();
        System.out.println("Dairenin Dilim Açısını giriniz: ");
        dilimAcisi = girdi.nextInt();

        formula = (pi * (r * r) * dilimAcisi) / 360;
        System.out.println("\nDairenin Diliminin Alanı = " + formula);
    }
}