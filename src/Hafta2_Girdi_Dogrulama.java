import java.util.Scanner;

public class Hafta2_Girdi_Dogrulama {// 0-100 arasında dışarıdan sayı gir arasında değilse tekrar girmesini iste
    public static void main(String[]args){
        int sayi=0;
        assing(sayi,50,60);
        int sayi2=0;
        assing(sayi2,0,90);
        
        
    }
    public static void assing(int sayi,int lb ,int ub){
        Scanner input= new Scanner (System.in);
       
        do{
            System.out.println("lütfen bir sayı giriniz = ");
            sayi=input.nextInt();
        }while(sayi<lb||sayi>ub);
       
       
        
    }
       
    
}
