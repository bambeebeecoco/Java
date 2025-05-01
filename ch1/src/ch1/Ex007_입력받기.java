package ch1;

import java.util.Scanner;

/*
할일: 사용자에게 입력 받을수 있는 방법 알기
    scanner 클래스 사용
* */
public class Ex007_입력받기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 클래스 객체 생성 (인스턴스화 했다 힙 영역에 올려놓은 상태)

        System.out.println("이름을 입력하시오");
        String input = sc.nextLine();// 입력을 받고 input 에 저장
        //System.out.println(input);

        System.out.println("나이를 입력하시오");
            int age = sc.nextInt();
            String age_txt = sc.nextLine(); // 문자열로 받은 경우 숫자형으로 변환하려면
//            int age = Integer.parseInt(age_txt); // 이렇게 하면 됨. 변환할자료형클래스.parse자료형(데이터)

        System.out.println(input +"님의 나이는" + age + "살 입니다.");

        sc.close();
    }
}
