package com.sorting;
/*
Bubble Sort Time & Space Complexity
 Time
         Worst Case - O(nlogn)
 Space
 O(n) as there is an external use of any array
 */


import java.util.Arrays;

public class MergeSortAlgo {
public static void main(String[] args){
    int[] array = {7,3,5,4,6};
    mergeSort(array);
    System.out.println(Arrays.toString(array));
}

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
            int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
            mergeSort(left);
            mergeSort(right);
            mergeAlgo(array, left, right);
        }
    }

    public static void mergeAlgo(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }



}
