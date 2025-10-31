package Sorting;

public class Bubble {
    public static void main(String[] args) {
        int arr[] ={42,32,22,62,52,12,2};
        for(int a:bubbleSort(arr)){
            System.out.print(a+" ");
        }
    }
    static int[] bubbleSort(int... arr){
        for(int i=arr.length-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
