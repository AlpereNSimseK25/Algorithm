import java.util.Random;

public class Hafta1_Vektor_Carpimi {//
    public static void main(String[]args){
        int []x=new int [5];
        vec_random(x);
        System.out.print("x");
        vec_print(x);

        int []y=new int[5];
        vec_random(y);
        System.out.print("y");
        vec_print(y);
        int []z= new int[5];
        
        int []result = new int[5];
        ew_multiplication(result,x,y);
        vec_print(result);
        
        for (int i = 0; i <z.length-1; i++) {
            z[i]=x[i]*y[i];
            
        }
    }
    public static void vec_random( int []a){
        Random rnd = new Random ();
        for (int i = 0; i < a.length; i++) {
            a[i]=rnd.nextInt(10);
            
        }
    }
    public static void vec_print(int []a){
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
    public static void ew_multiplication(int[] z ,int[] a,int[] b){
        for (int i = 0; i < a.length; i++) {
            z[i] =a[i]*b[i];
        }
    }
}
