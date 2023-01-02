package com.sorting;
import java.util.Arrays;
/*
TIme And Space Complexity of bubble sort

****************Time***************
  worstcase - O(n*2)
  bestcase  - O(n) when sorted array

  *************Space***********
  O(1) -- there is no external use of array
 */
public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] array = {7,3,5,1,2,3};
        bubbleSort(array);
        //after sorting
        System.out.println(Arrays.toString(array));
    }
    static void bubbleSort(int[] array){
        for(int i =0;i<array.length-1;i++){
            boolean swap = false;
            for(int j = 0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        swap = true;
                }
//                }
            if(!swap) break;
        }
    }
}
}
