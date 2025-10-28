package Sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] ={42,32,22,62,52,12,2};
        int high= arr.length-1;
        /*for(int a:mergeSort(arr,0,high)){
            System.out.print(a+" ");
        }*/
        mergeSort(arr,0,high);
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
    static void mergeSort(int[] arr,int low,int high){
        
        if(low>=high) return ;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        mergeFinal(arr,low,mid,high);
    }
    static void mergeFinal(int[] arr,int low,int mid,int high){
        int left=low;
        int right =mid+1;
        ArrayList<Integer> temp =new ArrayList<>();
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int j=low;j<=high;j++){
            arr[j]=temp.get(j-low); // ori++;
        }
    
    }
    
}
