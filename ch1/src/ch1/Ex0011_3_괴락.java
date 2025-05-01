package ch1;

import java.util.Scanner;

/* 이름, 국영수 입력 받고
    평균 60점 미만,
    평균 60점 이상 이어도 한과목이라도 40점 미만이면 과락

    -출력
        xxx님의 총점 : nnn이고 평균: 00이고 괴락/ 통과입니다.
*/
public class Ex0011_3_괴락 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하시오");
        String name = sc.nextLine();

        System.out.println("국어점수를 입력하시오");
        int ko = sc.nextInt();
        System.out.println("영어점수를 입력하시오");
        int en = sc.nextInt();
        System.out.println("수학점수를 입력하시오");
        int math = sc.nextInt();

        int total = ko + en + math;
        double avg = total / 3.00;

        if ((ko > 40 && en > 40 && math > 40) && (avg >= 60)) {
            System.out.println(name + "님의 총점은 " + total + " 평균은 " + avg + " 통과입니다.");
        }
        else {
            System.out.println(name + "님의 총점은 " + total + " 평균은 " + avg + " 불통과입니다.");
        }

        sc.close();
    }
}
