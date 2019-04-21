package ru.mingazov.task3;



public class FindLowestNubmer {
    public static void main(String[] args) {
        find(12,2);
        find(901, 783);
        find(13, 14);
        find(0, 0);


    }
    private static void find(int a, int b) {
        if (a > b) {
            System.out.println(b + " меньше " + a);
        } else if (a < b){
            System.out.println(a + " меньше " + b);
        } else if (a == b){
            System.out.println("Числа равны");
        }
    }
}