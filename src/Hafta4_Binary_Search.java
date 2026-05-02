public class Hafta4_Binary_Search {// binary search örneği böl parçala mantığıyla
    public static int binarysearch(int[]array , int target){
        int left =0;
        int right= array.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if (array[mid]==target) {
                return mid;
                
            }
            else if(array[mid]>target){
                right= mid+1;
                
            }
            else{
                left=mid-1;
            }
        }
        return -1;
    }
    public static void main (String[]args){
        int []A={1,3,5,6,11,15,17};
        int aranan=6;
        int index = binarysearch(A,aranan);
        System.out.println(index);
        
    }
    
}
