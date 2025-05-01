package ch2_객체지향.Ex22_메서드실습;

import java.util.Scanner;

/** 할일: 메서드 만들어서 사용해보기
 *      현재 클래스에서 메서드들을 바로 사용할수도 있고,
 *      메서드들을 선언만 해놓고 다른 파일(클래스)에서 불러다 사용할수도 있다.
 *     이번 파일 에서는 같은 클래스에 있는 메서드를 사용해 볼서임
 */



public class Ex022_1_메서드실습 {
    public Ex022_1_메서드실습(){}

    //숫자 하나 보내서 10을 더한 결과를 돌려주기
     int getOne(int num) {
         return num + 10;
     }

    //숫자 두개 보내서 두 수의 합을 리턴하기
     int getTwo(int num1, int num2) {
         return num1 + num2;
     }

    public static void main(String[] args){
        Ex022_1_메서드실습 tmp = new Ex022_1_메서드실습();

        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하시오");
        String name = sc.nextLine();

        System.out.println("숫자를 입력하시오");
        int num = sc.nextInt();

        // getOne 사용해보고, 여기서 출력하기. -출력: 입력하신 숫자는 .. 이고, 결과는 ..입니다 .
        System.out.println("입력하신 숫자는" +num+"이고, 결과는" + tmp.getOne(num) + "입니다");
        // getTwo 사용해보고, 여기서 출력하기. -출력: 일력하신 숫자는 .. 와 ..이고, 두 수의 합은 .. 입니다.
        System.out.println("첫번째 숫자를 입력하시오");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력하시오");
        int num2 = sc.nextInt();

        System.out.println("일력하신 숫자는" +num1+ "와" +num2+ "이고, 두 수의 합은"+ tmp.getTwo(num1, num2)+ "입니다.");
    }
}
