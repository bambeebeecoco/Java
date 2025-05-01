package ch2_객체지향.Ex22_메서드실습;

import java.util.Scanner;

/** 할일: 메서드 만들어서 사용해보기
 *      현재 클래스에서 메서드들을 바로 사용할수도 있고, 메서드들을 선언만 해놓고 다른 파일(클래스)에서 불러다 사용할수도 있다.
 *      이번 파일 에서는 같은 클래스에 있는 메서드를 사용해볼거임
 */
public class Ex22_1_메서드만들기실습1 {
    public Ex22_1_메서드만들기실습1() { }

    // 숫자 하나 보내서 10을 던한 결과를 돌려주기
    int getOne(int num) {
        return num + 10;
    }
    
    // 숫자 두개 보내서 두 수의 합을 리턴하기
    int getTwo(int num1, int num2) {
        return (num1+num2);
    }
    
    public static void main(String[] args) {
        Ex22_1_메서드만들기실습1 tmp = new Ex22_1_메서드만들기실습1();

        Scanner sc = new Scanner(System.in);
        // 이름 입력 받고
        System.out.print("이름을 입력하시오: ");
        String name = sc.nextLine();

        // getOne 사용해보고, 여기서 출력하기. - 출력: 홍길동님이 입력하신 숫자는 XX 이고, 결과는 XX 입니다.
        int num = sc.nextInt();
        System.out.println(name+"님이 입력하신 숫자는 "+num+" 이고, 결과는 "+ tmp.getOne(num) +" 입니다.");

        // getTwo 사용해보고, 여기서 출력하기. - 출력: 홍길동님이 입력하신 숫자는 XX 와 XX 이고, 두 수의 합은 XX 입니다.
        System.out.println("첫번째 숫자 입력");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자 입력");
        int num2 = sc.nextInt();
        System.out.println(name+"님이 입력하신 숫자는 "+num1+" 과 "+num2+" 이고, 결과는 "+ tmp.getTwo(num1, num2) +" 입니다.");
        
    }
}















