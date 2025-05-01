package ch1;

import java.util.Scanner;

/* 할일: 숫자 두개 입력받고
    첫번째: 시작단
    두번째: 끝단

    == 3단 ==
    3 * 1 = 3
    3 * 2 = 6
    3 * 3 = 9
    3 * 4 = 12
    3 * 5 = 15
    3 * 6 = 18
    3 * 7 = 21
    3 * 8 = 24
    3 * 9 = 27

    == 4단 ==
    4 * 1 = 4
    4 * 2 = 8
    4 * 3 = 12
    4 * 4 = 16
    4 * 5 = 20
    4 * 6 = 24
    4 * 7 = 28
    4 * 8 = 32
    4 * 9 = 36

    == 5단 ==
    5 * 1 = 5
    5 * 2 = 10
    5 * 3 = 15
    5 * 4 = 20
    5 * 5 = 25
    5 * 6 = 30
    5 * 7 = 35
    5 * 8 = 40
    5 * 9 = 45
*/
public class Ex15_1_구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dan1 = sc.nextInt();
        int dan2 = sc.nextInt();

        for(int i = dan1; i <= dan2; i++) {
            System.out.println("== "+i+"단 ==");
            for(int j=1; j<=9; j++) {
                System.out.println(i+"X"+j+"="+(i*j));
            }
            System.out.println("");
        }
    }
}



















