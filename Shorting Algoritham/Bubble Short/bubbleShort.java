public class bubbleShort {
public static void  bubbleshort(){
 int arr[] = {1,2,3,4,5};
 int end = arr.length - 1;

 for (int j = 0; j < arr.length; j++) {
     for (int i = 0; i < end - j ; i++) {
         if (arr[i] > arr[i+1]) {
               int temp =  arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = temp;        
         }
         
     }
     
 }

 for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]);
 }

}
   

public static void main(String[] args) {
    bubbleshort();
}
}