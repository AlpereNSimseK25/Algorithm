import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VizeDeneme2 {

    /*Kullanıcıdan altı sayı iste , sayılar birbirinden farklı olacak, aynı sayı olduğunda tekrar sayı istenecek, kullanıcının girdiği altı sayı sıralanacak
    Üretilen dizi
    Kullanıcıdan alınan diziler
    Doğru tahmin edilen sayılar söylenecek
    Containes methodu kullanılacak*/

    public static void sayilar() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        ArrayList<Integer> alinanSayilar = new ArrayList<>();
        while(alinanSayilar.size()<6){
            System.out.print((alinanSayilar.size()+1)+". sayıyı giriniz: ");
            int sayi = sc.nextInt();
            if (!alinanSayilar.contains(sayi)){
                alinanSayilar.add(sayi);
            }
            else {
                System.out.println("Listede zaten olan bir sayı girdiniz yeni  bir sayı giriniz.");
            }
        }

        ArrayList<Integer> uretilenSayilar = new ArrayList<>();
        while (uretilenSayilar.size() <6){
            int sayi = rnd.nextInt(101);
            if (!uretilenSayilar.contains(sayi)){
                uretilenSayilar.add(sayi);
            }
        }

        System.out.print("Kullanıcıdan alınan sayılar: "+ alinanSayilar);
        System.out.println();
        System.out.println("Random oluşturulan sayılar: "+ uretilenSayilar);

        ArrayList<Integer> ortakSayilar = new ArrayList<>();
        for (int i=0; i<alinanSayilar.size(); i++){
            int kontrolSayisi = alinanSayilar.get(i);
            if (uretilenSayilar.contains(kontrolSayisi)){
                ortakSayilar.add(kontrolSayisi);
            }
        }

        System.out.println("Ortak olarak bulunan sayılar: "+ ortakSayilar);
        System.out.println("Ortak sayı sayısı: "+ ortakSayilar.size());

    }

    public static void main(String[]args){
        VizeDeneme2.sayilar();
    }
}
