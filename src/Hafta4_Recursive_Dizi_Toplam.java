public class Hafta4_Recursive_Dizi_Toplam {// n boyutlu dizi toplam SINAAAAAAVVVV
    public static int sumarray(int[] array,int index){
        if (index==array.length) {// base case
            return 0;//durdur
            
        }
        return array[index]+sumarray(array,index+1);//recursive call
    }
    public static void main(String[]args){
       
    }
    
}
