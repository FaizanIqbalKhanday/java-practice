// Sorting algorithms
package com;

public class Atest {
    //bubble sort
    public static void bubbleSort(int[] elements){
        for(int i=0;i<elements.length-i;i++){
            for(int j=i+1;j<elements.length-1;j++){
                if(elements[i]>elements[j]){
                    int temp=elements[i];
                    elements[i]=elements[j];
                    elements[j]=temp;
                }
            }
            
        }
        for(int i=0;i<elements.length;i++){
            System.out.print(elements[i]+" ");         
        }

    }
    //selection sort
    public static void selectionSort(int[] elements){
        for(int i=0;i<elements.length-i;i++){
            for(int j=i+1;j<elements.length-1;j++){
                if(elements[j]<elements[i]){
                    int temp=elements[j];
                    elements[j]=elements[i];
                    elements[i]=temp;
                }
            }
            
        }
        for(int i=0;i<elements.length;i++){
            System.out.print(elements[i]+" ");         
        }

    }
    public static void main(String[] args) {
        int[] elements ={5, 2, 1, 3, 7};
        //bubbleSort(elements);
        selectionSort(elements);

        
    }
    
}
