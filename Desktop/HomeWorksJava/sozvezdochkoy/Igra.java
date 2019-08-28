package ru.mingazov.sozvezdochkoy;

import java.util.Scanner;

public class Igra {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chislo = (int) (Math.random() * 100);
        System.out.println(chislo);
        int userChislo   = 0;
        int staroeChislo = 0;
        String exit      = "exit";

        while(userChislo != chislo){
            System.out.println("Введите число");
            if (scanner.hasNextInt()){
                userChislo = scanner.nextInt();
                if (raznica(userChislo, chislo) <= raznica(staroeChislo, chislo)) {
                    staroeChislo = userChislo;
                    System.out.println("Тепло");
                } else {
                    staroeChislo = userChislo;
                    System.out.println("Холодно");
                }
            } else {
                if(scanner.nextLine().equals(exit)){
                    System.out.println("Вы вышли из программы");
                    break;
                } else {
                    System.out.println("Введена нечитаемая информация!");
                }
                }

            }
        if (userChislo == chislo) {
            System.out.println("Поздравляю! Вы отгадали число!");
        }

        }



    private static int raznica(int a, int b){
            int     c = a - b;
            return Math.abs(c);
        }

}