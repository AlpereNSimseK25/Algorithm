import java.util.Scanner;

public class Hafta1_Vektor_Atama {            //firstapp'ın metodlu hali
    public static void vec_print(int [] a){
        System.out.print("Vektör: [");
        for (int i = 0; i < a.length; i++) {
            if (i==a.length-1) {
                System.out.print(a[i]+"]");
                
            }
            else{
                System.out.print(a[i]+", ");
            }
        }
        System.out.println();
        
    }
    public static void main(String[] args){
        int []x =new int[5];
        vec_assing(x);// vector assing
        System.out.print("x");
        vec_print(x);//vector print
        int[]y =new int [5];
        vec_assing(y);
        System.out.print("y");
        vec_print(y);
        
        //elementwise vector multiplication
        int [] z=new int[x.length];
        for (int i = 0; i < z.length; i++) {
            z[i]= x[i]*y[i];
            
        }
        System.out.print("z");
        vec_print(z);
    }
    public static void vec_assing(int []a ){// vector assaing = vektör atama
        Scanner input = new Scanner (System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1)+" inci eleman");
            a[i]=input.nextInt();
        }
    }
}
