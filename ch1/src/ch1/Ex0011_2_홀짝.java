package ch1;

import java.util.Scanner;

public class Ex0011_2_홀짝 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        int total = num + num2;

//        if (total % 2 == 0) {
//            System.out.println("짝수");
//        }
//        else if (total == 0) {
//            System.out.println("0");
//        }
//        else {
//            System.out.println("홀수");
//        }

        System.out.println("입력하신 수의 합은 " + total + " 이고 " + (total%2==0? "짝수":"홀수") + "입니다.");

        sc.close();
    }
}
