package sorting;

import static sorting.InsertionSortExample.insertionSort;
import static sorting.bubbleSort.bubbleSort;


public class Sorting {

   
       public static void main(String a[]){    
        int[] arr1 = {23,13,14,42,32};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("Insertion Sorted array Ascending");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }   
        
        int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("\n Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
    }    
} 
