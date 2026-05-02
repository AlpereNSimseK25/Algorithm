import java.util.Random;
import java.util.Scanner;

public class Hafta1_Dizi_Yazdirma {//standart diziyi yazdırma

    public static void array_print(int[] a) {
        System.out.print("dizi = [");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print("]");
            } else
                System.out.print(a[i] + " ,");
        }
        System.out.print("");
    }

    public static void main(String[] args) {
        System.out.print("Kaç elemanlı bir dizi oluşsun: ");
        Scanner sc = new Scanner(System.in);
        int eleman = sc.nextInt();

        Random rnd = new Random();
        int[] dizi = new int[eleman+1];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(50);
        }
        array_print(dizi);
    }
}
