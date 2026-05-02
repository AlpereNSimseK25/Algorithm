import java.util.Random;

public class Hafta2_Benzersiz_Dizi {// farklı method( birbirinden farklı 6 sayı)
    public static boolean contains(int[] array, int size , int number){
        
        for (int i = 0; i < size; i++) {
            if (array[i]==number) {
                return true;//return işlemi çalışırsa metodun çalışması durur
                
            }
            
        }
        return false;
    }
    public static int[] arraygenerator ( int N,int min, int max){
        Random rnd=new Random(N);
        int[]array = new int [N];
        for (int i = 0; i < array.length; i++) {
            int number;
            do {
                number= rnd.nextInt(50);//1-49 arasında
                
            } while (contains(array,i,number)==true);
            array[i]=number;
            
            
        }
        return array;
    }
    public static void main (String[]args){
        //yazdırmayı başka dosyadan metod çağırarak yapmış
    }
}
