public class Hafta4_Recursive_Fibonacci {
    public static void count ( int n){// fibonacci sayıları yazdırma
        if (n==0) {
            return;//durdur
            
            
        }
        System.out.println(n);
        count(n-1);//retrecursive case
        
    }
    public static void main(String[]args){
        
        int a=6;
        for (int i = 0; i < a; i++) {
            if (i==(a-1)) {
                System.out.print(fibonacci(i)+" ");
                
            }
            else {
             System.out.print(fibonacci(i)+",");
            } 
        }
        
        
        
    }
    public static int fibonacci( int n){
        if (n==0) {// base 1
            return 0;
            
        }
        if (n==1) {//base 2
            return 1;
            
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
     public static void printdigit(int n){// basamaaaaakkk yazdırma 
        if (n==0) {// base case
            return;// durdur
            
        }
        System.out.println(n%10);
        printdigit(n/10);// recursive call
        
        
    }
    
}
