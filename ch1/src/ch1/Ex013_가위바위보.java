package ch1;

/*할일 : 컴퓨터랑 가위 바위 보 게임하기
        사용자에게 가위 바위 보 중 하나  입력 받고
        컴퓨터는 램덤으로 123중 하나내서
        승자 판별하기
    가위  - 1
    바위  -2
    보   -3

    -출력
    컴터 - 가위 vs 사람 - 바위
    사람 승 */

import java.util.Scanner;

public class Ex013_가위바위보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가위, 바위, 보 중 하나를 입력하시오");
        String input = sc.nextLine();
        //만약 사용자가 받은  문자중에 가위, 바위, 보 중에 어떤것일까
//        if(input ){}

        //입력받은 가위 - 1 , 바위 - 2 , 보 - 3 으로 숫자로 변환
        String cigar = "가위";
        String rock = "바위";
        String pap = "보";



    }
}
