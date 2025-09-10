package Sorting;

public class Selection {
    public static void main(String[] args) {
        int arr[] ={42,32,22,62,52,12,2};
        //int result[]=selectionSort(arr);
        for(int a:selectionSort(arr)){
            System.out.print(" "+a);
        }
    }
    static int[] selectionSort(int[] arr){

        for(int i=0;i<=arr.length-2;i++){
            int small = i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[small]>arr[j]){
                    small = j;
                }
            }
            int temp =arr[small];
            arr[small] = arr[i];
            arr[i]=temp;

        }
        return arr;
    }
}
