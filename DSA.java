public class DSA {
public static void reverse() {
  int arr[] = {1,2,3,4,5,6};
   int start = 0 ;
   int end = arr.length - 1;
   int temp ;
while (start <= end ) {
    temp = arr[start];
    arr[start]= arr[end];
    arr[end] = temp   ;
    start++;
    end--;
}

for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+ " ");
}
  
}


public static void lagestSmallest() {
  int arr[] = {1,2,3,4,5,6,6,732,232};
  int largest_value = Integer.MIN_VALUE;
  int smallest_value = Integer.MAX_VALUE;
 
  for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest_value) {
          largest_value = arr[i];
        }
  }
  System.out.println("largest value :" + largest_value);

  for (int i = 0; i < arr.length; i++) {
    if (arr[i] < smallest_value) {
       smallest_value = arr[i];
    }
  }
    System.out.println("Smallest Value :" + smallest_value);

}

public static int sumofArray(){
  int arr[] = {1,2,3,4,5};
  int sum  = 0 ;
  for (int i = 0; i < arr.length; i++) {
         sum += arr[i];
  }
  return sum;
}

public static int singleNumber (){
  int arr[]= {1,2,3,2,3,1,4,4,5};
  int singleNumber = 0;
  for (int i = 0; i < arr.length; i++) {
       singleNumber ^= arr[i] ;
  }
  return singleNumber;
}

public static void subArray(){
  int arr[]= {1,2,3,4,5};

   for (int start = 0; start < arr.length; start++) {
           for (int end =start; end <arr.length; end++){
                    for (int i = start; i <= end; i++) {
                         System.out.print(arr[i]);
                    }
                    System.out.print(" ");
           }
           System.out.println();
   }



}
 

public static void maximumSubArray(){
  int arr[]={1,2,-3,4,5};
  int maxsum = Integer.MIN_VALUE;
   for (int start = 0; start < arr.length; start++) {
     int sum = 0 ;
       for (int end = 0; end < arr.length; end++) {
              sum += arr[end];
              maxsum = Math.max(sum, maxsum);
       }
   }
   System.out.println("maximum subArray :"  + maxsum );
}

public static void kadansAlog(){
  int arr[] = {1,-2,43,8};
  int maxsum  = Integer.MIN_VALUE;
  int sum = 0 ;
  for (int i = 0; i < arr.length; i++) {
          sum += arr[i];
          maxsum = Math.max(maxsum, sum);
          if (sum < 0 ) {
            sum = 0 ;
          }
  }
  System.out.println( "maxsum is : " + maxsum);
}


public static int pairSum(){
  int arr[] = {1,2,3,4,5,34,421};
  int target = 39 ;
  
  for (int start = 0; start < arr.length; start++) {
      for (int end = start; end < arr.length; end++) {
            if (arr[start] + arr[end] == target) {
              return start + end;
            }
      }
    
  }
  return -1;

}


public static void trappedWater(){
  int height[] = {4,2,0,6,3,2,5};
// steps 
// calculte left max boundary 
int leftMax[] = new int[height.length];
leftMax[0] = height[0];
for (int i = 1; i < height.length; i++) {
  leftMax[i] = Math.max(height[i], leftMax[i-1]) ;
  
}
// calculate right max boundary 
int rightMax[] = new int[height.length];
rightMax[height.length - 1] = height[height.length - 1];
for (int i = height.length -2 ; i >= 0 ; i--) {
        rightMax[i] = Math.max(height[i],rightMax[i+1]);
} 
// loop 
int tp = 0 ;
int ans = 0 ;
for (int i = 0; i < height.length; i++) {
                                                     // WL = min (LeftMax Boundary , Right max Boundary) 
      int wl = Math.min(rightMax[i], leftMax[i]);
                                                               // TW = WL - Height[i]
      tp = wl - height[i];
      // tp += wl - height[i] 
     ans += tp ;
}
System.out.println("Trapped tainwater :" + ans);

}










public static void main(String[] args) {
trappedWater();
    
  }
}