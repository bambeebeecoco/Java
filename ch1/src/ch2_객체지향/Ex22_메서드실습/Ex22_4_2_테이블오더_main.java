package ch2_객체지향.Ex22_메서드실습;

import java.util.Scanner;

public class Ex22_4_2_테이블오더_main {
    public static void main(String[] args) {

        // 메뉴판 보여주기
        Ex22_4_1_테이블오더 m = new Ex22_4_1_테이블오더();

        System.out.println("== 메뉴 ==");
        for(int i = 0; i < m.menuPan.length; i++) {
            System.out.println((i+1) + " - " + m.menuPan[i].getMenuName() +", " + m.menuPan[i].getMenuPrice());
        }

        System.out.println("메뉴를 선택하시오");
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();

        m.printMenu(idx);

//        String sel_menu = m.menuPan[idx-1].getMenuName();
//        int sel_price = m.menuPan[idx-1].getMenuPrice();
//        System.out.println("선택한 메뉴는 "+sel_menu+" 이고, 가격은 "+sel_price+"원 입니다.");
    }
}
