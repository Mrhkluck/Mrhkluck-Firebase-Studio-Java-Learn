package com.example.demo.Q10_DSA;

public class MovingArray {
    public static void movingZero(int arr[]){
        int n = arr.length; //6 [1,3,0,0,8,0]  //[1,3,8,0,0,0]
        int newarr[] = new int[n]; //6 [1,3,8,0,0,0]
        int newIndex=0; //0,1,2,3
        for(int i=0; i<n;i++){
          if(arr[i] != 0 ){
              newarr[newIndex++]= arr[i];
            // newIndex++; 
          }
        }
         for(int i=0;i<n;i++){
          arr[i] = newarr[i];
         }
  
      }
  
      public static void printArr(int arr[]){
          for(int i =0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
          } 
          System.out.println();
      }
      public static void main(String[] args) {
          int arr[] = {1,3,0,0,8,0};
          printArr(arr);
          movingZero(arr);
          printArr(arr);
      }
}
