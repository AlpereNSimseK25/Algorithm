import java.util.Random;

public class Hafta1_Skaler_Carpim {//n boyutlu dizi oluştur ve diziyi döndür

    public static int[] array_creator(int N) {// dizi oluşturma yaratma gibi bir anlam =>array creator
        Random rnd = new Random();
        int[] dizi = new int[N];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(50); // 0 ile 49 arasında sayılardan seçer
        }
        return dizi;
    }

    public static void dotproduct(int[] a, int[] b) {//skaler çarpma
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        System.out.print("Vektörlerin skaler çarpımı = " + result);
    }

    public static void array_print(int[] a) {
        System.out.print("dizi: [");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i] + "]");

            } else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] dizi1 = array_creator(6);
        array_print(dizi1);
        int[] dizi2 = array_creator(6);
        array_print(dizi2);
        dotproduct(dizi2, dizi1);
    }
}
