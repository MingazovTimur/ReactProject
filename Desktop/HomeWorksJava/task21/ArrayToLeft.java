package ru.mingazov.task21;

public class ArrayToLeft {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6} ,{4,5,6,7,8,9}, {7,8,9,10,11,12}};

        printArray(arr);

        toLeft(arr);

        printArray(arr);

    }



    public static void printArray (int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int c = 0; c < arr[i].length; c++) {
                System.out.print(arr[i][c] + " ");
            }
            System.out.println();
        }
    }

    public static void toLeft(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int c = 0; c < arr[i].length; c++) {
                if(c == arr[i].length -1){
                    arr[i][c] = 0;
                } else {
                    arr[i][c] = arr[i][c + 1];
                }
            }
        }
    }
}
