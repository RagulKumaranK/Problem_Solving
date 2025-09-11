package Sorting;

public class Insertion {
    public static void main(String[] args) {
        int arr[] ={42,32,22,62,52,12,2};
        for(int a:selectionSort(arr)){
            System.out.print(a+" ");
        }
    }
    static int[] selectionSort(int... arr){
        for(int i=1;i<=arr.length-1;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }   
}
