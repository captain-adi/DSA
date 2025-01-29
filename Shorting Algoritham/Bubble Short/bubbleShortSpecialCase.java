
// what if the array is already shorted 
// if array is already shorted {1,2,3,4,5} than the bubble short take same time it itrate all the elments 
// to avoid that we create a swap variable which hold how many time swap performe in the itration if the itretion is 0 that means there are no such element that is used to me swap or short 
//  That means array is already shorted .........................

public class bubbleShortSpecialCase {
public static void shoredArray() {
    int arr[] = {1,2,3,4,5};
    int end = arr.length - 1;
   
    for (int j = 0; j < arr.length; j++) {
       int swap =  0 ;
        for (int i = 0; i < end - j ; i++) {
            if (arr[i] > arr[i+1]) {
                  int temp =  arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = temp;        
            }
            
        }
        
        if (swap == 0) {
           System.out.println(" Array is already Shorted :");
           break;
        }
        System.out.println("hello");    // can't print hello bcz breake tarminate the loop in single iteration
    }
   
  
}


        public static void main(String[] args) {
            shoredArray();
        
    }
}