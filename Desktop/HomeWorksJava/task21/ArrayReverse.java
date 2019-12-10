package ru.mingazov.task21;



public class ArrayReverse {
    public static void main(String[] args) {
        int [] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        int nElems = 10;

        printIntArray(arr);

        reverseIntArray(arr, nElems);

        printIntArray(arr);


    }

    public static void printIntArray(int[] arr){
        System.out.print("Массив: " );
        for(int a : arr ){
            System.out.print(a + " ");
        }
    }

    public static void swap(int[] arr, int one, int two){
        int i = arr[one];
        arr[one] = arr[two];
        arr[two] = i;

    }

    public static void reverseIntArray(int[] arr, int nElems){
        int right = nElems - 1;

        for (int left = 0; left < right; left ++) {
                swap(arr,left, right);
                right--;
            }


    }
}
