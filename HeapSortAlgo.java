package com.sorting;

import java.util.Arrays;

/*
Time And Space for heap
Worst Case Time Complexity is O(n*2)
and best Case Tc O(n*2)
and space is O(1) as there is no use of array is done


 */
public class HeapSortAlgo {
    public static void main(String[] args) {
     int[] arr = {7,10,3,2,9};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int first,int next){
        int temp = arr[first];
        arr[first] = arr[next];
        arr[next] = temp;
    }
    static int pivot(int[] arr,int start ,int end){
            int swapIdx = start;
            int pivot = arr[start];
            for(int i =start+1;i<=end;i++){
                        if(pivot>arr[i]){
                            swapIdx++;
                            swap(arr,i,swapIdx);
                        }
            }
            swap(arr,swapIdx,start);
    return swapIdx;
    }
    static void sort(int[] arr,int start,int end){
        if(start<end){
            int pivotIdx = pivot(arr,start,end);
            //now array 2,3,7,10,9
            sort(arr,start,pivotIdx-1);//for the left side of the pivotIndex
            sort(arr,pivotIdx+1,end);//for the right side of the pivotIndex
        }
    }
}
