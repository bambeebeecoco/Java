package ch1;
/*할일: 주민번호에서 생년월일과 성별 출력하기
        ex) 990101-1234567
        생년월일 1999년 1월 1일
        성별ㅣ 남

        020101-4234567
        생년월일 2002년 1월 1일
        성별ㅣ 여
   */

import java.util.Scanner;

public class Ex0010_2연습문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민번호를 입력하시오");
        String num = sc.nextLine();

        String[] split = num.split("-");

        //출력해-입력받은값 확인하고
        System.out.println(split[0] + " " + split[1]);
        //split[0] = 생년월일 -> 00년생 이후 이전 앞에 한자리 > 0  "20"+ spit[0] // 9 == "19" + split[0]
        //split[1] = 성별


        //앞 한자리가 9일때는 19로 출력해주고 0일때는 20을로 출력
        // -뒤가 1,3일때는 홀수 성별 남 2,4일때 짝수 성별 여자


    }
}
