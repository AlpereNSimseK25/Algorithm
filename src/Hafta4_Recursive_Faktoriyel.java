public class Hafta4_Recursive_Faktoriyel {// recursive methods (özyinelemeli metotlar)
    public static int factorial(int N){
            if (N==0) {// base case
                return 1;
                
            }
            return N*factorial(N-1);// recursive call
           // int sonuç=factorial(4);
            //System.out.println(4*factorial(3));
           // System.out.println(4*(3*factorial(2)));
           // System.out.println(4*(3*(2*factorial(1))));
           // System.out.println(4*(3*(2*(1*factorial(0)))));
            
    }
    
}
