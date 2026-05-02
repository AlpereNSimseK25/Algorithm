import java.util.Random;

public class Hafta3_Bellek_Yonetimi {
    public static void assingarray(int[]dizi){
        Random rnd =new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=rnd.nextInt(50);
            
        }
        
    }
    public static void assingum(int num){
        Random rnd= new Random ();
        num = rnd.nextInt(10);
    }
    public static void main (String[]args){
        int[]a=new int[5];
        assingarray(a);
        int number= 0;
        assingum(number);
        
        
    }
    //pass by referance = değişkenler
    //pass by valve = diziler
    //verioble larda değerin kopyası; object ve dizilerde aadres kop
    
}
