package ch1;

import java.util.Scanner;

public class Ex15_2_구구단_가로출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dan1 = sc.nextInt();
        int dan2 = sc.nextInt();

        for(int i = dan1; i <= dan2; i++) {
            System.out.print("== "+i+"단 ==\t\t");
        }
        System.out.println("");

        for (int i = 1; i <= 9; i++) {
            for(int j = dan1; j <= dan2; j++) {
                System.out.print(j+"X"+i+"="+(i*j) + "\t\t\t");
            }
            System.out.println("");
        }
    }
}
