public class Hafta4_Recursive_Basamak_Toplam {// basamakları yazdırma

    public static void printdigit(int n){
        if (n==0) {// base case
            return;// durdur
            
        }
        System.out.println(n%10);
        printdigit(n/10);// recursive call
        
        
    }
    public static void main (String[]args){
      
        int toplam= sum(10);
        System.out.println(toplam);
        
        
    }
    //sum(5)=5+sum(4)=5+4+sum(3)=5+4+3+sum(2)=5+4+3+2+sum(1)=5+4+3+2+1
    public static int sum(int a){
        if (a==1) {
            return 1;
        
        }
        
        return a + sum (a-1);
       
       
        
        
        
    }
    
}
