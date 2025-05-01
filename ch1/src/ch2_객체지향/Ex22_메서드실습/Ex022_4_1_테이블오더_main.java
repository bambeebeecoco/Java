package ch2_객체지향.Ex22_메서드실습;

import java.util.Scanner;

/** 할일: 식당 테이블오더 프로그램 작성
 *       각 메뉴(deta)마다 이름(menuName)과 가격(price)
 *
 *       0 넣을때까지 계속 찍기
 *
 *  1 - 쌀국수, 11000
 *  2 - 칼국수, 9000
 *  3 - 초밥, 14000
 *  4 - 오므라이스, 10000
 *  5 - 육회비빔밥, 12000
 *  6 - 도삭면, 10000
 *  7 - 샐러드 - 12500
 *  8 - 돈까스, 13000
 *  9 - 제육, 10000
 *  10 - 돼지국밥, 12000
 *
 *  - 출력
 *      선택한 메뉴는 XXX 이고, 가격은 XXX원 입니다.
 */
public class Ex022_4_1_테이블오더_main {
    public static void main(String[] args) {
        Ex022_4_2_테이블오더 menu = new  Ex022_4_2_테이블오더();
        //메뉴판 보여주기
        //System.out.println(menu.menuPan.);

        // 사용자 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴를 선택하시오.");
        int menuId = sc.nextInt();
        // 사용자가 고른 메뉴를 알아내기
        Ex022_4_2_테이블오더 tmp = new Ex022_4_2_테이블오더();

        // 사용자가 고른 메뉴와 가격 출력하기
    }
}
