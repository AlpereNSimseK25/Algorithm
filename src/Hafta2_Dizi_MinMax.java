public class Hafta2_Dizi_MinMax {// bir dizideki en küçük elemanı döndüren metod
    public static int findmax(int[]a){
      
        int max=a[0];
        for (int i = 0; i <a.length-1; i++) {
            System.out.println((i+1)+" inci dizi elemanını giriniz = ");
            
            System.out.println(""+a[i]);
        
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
                
            }
            
           
        }
        //System.out.println("maksimum= "+max);
        return max; 
    }
    public static  int findmin(int []a){
       
        int min=a[0];
        for (int i = 0; i <a.length-1; i++) {
            System.out.println((i+1)+" inci dizi elemanını giriniz = ");
           
            System.out.println(""+a[i]);
        
        }
        for (int i = 0; i < a.length; i++) {
            if (a[0]<a[i]) {
                min=a[0];
                
            }
          
        
        
        
        }  
        //System.out.println("minimim : "+min);
       
        return min;
        
    }
    public static void main (String[]args){
        int[]x={1,2,3,4,5};
        int enkucuk=findmin(x);
        int enbuyuk=findmax(x);
        
    }
        
}
    

