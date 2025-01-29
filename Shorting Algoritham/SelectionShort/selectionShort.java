public class selectionShort {

    public static void selectionshort(){
      int arr[]= {4,5,1,2,3};
     int end = arr.length- 1;
    
     for (int i = 0; i < end-1; i++) {
        int smallest_valueIndex = i ;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[smallest_valueIndex] > arr[j]) {
                 smallest_valueIndex = j ;
            }
        }
        int temp = arr[smallest_valueIndex] ;
        arr[smallest_valueIndex] =  arr[i];
        arr[i] = temp ;
     }

     for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ " ");
     }


    }
    public static void main(String[] args) {
        selectionshort();
    }
}