package ch1;

import java.util.Scanner;

/* 할일: 숫자 두개 입력받고
   첫번째: 시작단
   두번째: 끝단

   ==2단==
   2x1 = 1
   ...
   2x9 = 18

   ==3단==
 만약
 2 / 4
 2단 3단 4단


   */
public class Ex15_구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("시작단을 입력하시오");
        int num1 = sc.nextInt();

        System.out.println("끝단을 입력하시오");
        int num2 = sc.nextInt();

        for (int i = num1; i <=num2; i++) {
            System.out.println("==" + i + "단==");

            for (int j = 1; j <9; j++) {
                System.out.println( i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }


        sc.close();

    }
}
