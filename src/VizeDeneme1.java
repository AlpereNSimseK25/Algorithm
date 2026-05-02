import java.util.ArrayList;
import java.util.Scanner;

public class VizeDeneme1 {
    public static void varMiYokMu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Programda aradığınız ders nedir? ");
        String arancakDers = sc.nextLine();

        ArrayList<String> Dersler = new ArrayList<>();
        Dersler.add("Matematik");
        Dersler.add("Fizik");
        Dersler.add("Kimya");
        Dersler.add("Biyoloji");
        Dersler.add("Diferansiyel Denklemler");
        Dersler.add("Lineer Cebir");

        boolean varMi = Dersler.contains(arancakDers);

        if (varMi){
            System.out.println("Aradığınız ders bu programda bulunmaktadır. ");
        }
        else {
            System.out.println("Aradığınız ders bu programda bulunmamaktadır. Lütfen başka programa bakınız.");
        }
    }

    public static void main(String[] args){
        VizeDeneme1.varMiYokMu();
    }

}
