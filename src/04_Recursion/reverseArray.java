package Striver.Recursion;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        ArrayReverse(arr,0,arr.length-1);
        for(int a: arr){
            System.out.print(" "+a);
        }
    }
    static void ArrayReverse(int[] arr,int first,int last){
        if(first>=last) return ;
        int temp =arr[first];
        arr[first] =arr[last];
        arr[last] =temp;
        ArrayReverse(arr, first+1, last-1);
    }
}
