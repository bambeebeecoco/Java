package ch2_객체지향.Ex22_메서드실습;

import java.util.Scanner;

public class Ex22_3_2_자판기_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1) 사용자 입력 받기
        System.out.println("메뉴를 선택하시오");
        System.out.println("1-콜라, 2-사이다, 3-포도맛판타, 4-포카리");
        int menuId = sc.nextInt();
        System.out.println("------------------------------");

        Ex22_3_1_자판기 vm1 = new Ex22_3_1_자판기("1번 자판기");
        // 2) 무슨 음료 선택했는지 알아내기 - Ex22_3_1 클래스의 pushProductButton() 기능 동작시키기
        vm1.pushProductButton(menuId);
        
        // 3) 출력 - Ex22_3_1 클래스의 toString() 기능 동작시키기
        System.out.println(vm1.toString());


        System.out.println("------------------------------");
        System.out.println("메뉴를 선택하시오");
        System.out.println("1-콜라, 2-사이다, 3-포도맛판타, 4-포카리");
        menuId = sc.nextInt();

        Ex22_3_1_자판기 vm2 = new Ex22_3_1_자판기();
//        vm2.setvName("2번 자판기");
        vm2.pushProductButton(menuId);
        System.out.println(vm2);

    }
}










