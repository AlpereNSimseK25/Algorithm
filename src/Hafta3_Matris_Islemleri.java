public class Hafta3_Matris_Islemleri {
    public static int[] rowminidex(int[][]matrix){
        int row = matrix.length; int col =matrix[0].length;
        int[] dizi= new int[row];
        for (int i = 0; i < row; i++) {// row dış döngü ---Her satır için minimum değer arar
            int min = matrix[i][0]; int minindex=0;//Minimumun indeksini kaydeder
            for (int j = 0; j < col; j++) {// col iç döngü ---İndeksleri bir dizi olarak döndürür
                if (matrix[i][j]<min) {
                    min = matrix[i][j]; minindex=j;
                    
                }
                
            }
            dizi[i]=minindex;
            
        }
        return dizi;
    }
    
}
