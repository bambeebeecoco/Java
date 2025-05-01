package ch1;

import java.util.Scanner;

/*  할일: 컴퓨터랑 가위 바위 보 게임 하기
         사용자에게 가위(1), 바위(2), 보(3) 중 하나 입력 받고
         컴퓨터는 ramdom 으로 1,2,3 중 하나 내서 
         승자 판별하기

        가위 - 1
        바위 - 2
        보 - 3

    - 출력
    컴퓨터: 가위, 사람: 바위
    사람 승!
 */
public class Ex13_가위바위보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가위(1), 바위(2), 보(3) 중 하나 입력하시오");
        int user = sc.nextInt();
        String userInput ="";
        userInput = user==1?"가위":(user==2?"바위":(user==3?"보":""));

//        if (user == 1) {
//            userInput="가위";
//        }
//        else if (user == 2) {
//            userInput="바위";
//        }
//        else if (user == 3) {
//            userInput="보";
//        }

        // 1~3 사이의 랜덤수
        int com = (int)(Math.floor(Math.random() * (3 - 1 + 1) ) + 1);
        String comInput ="";
        comInput = com==1?"가위":(com==2?"바위":(com==3?"보":""));
//        if (com == 1) {
//            comInput="가위";
//        }
//        else if (com == 2) {
//            comInput="바위";
//        }
//        else if (com == 3) {
//            comInput="보";
//        }

        System.out.println("사용자: "+userInput+"("+user+")");
        System.out.println("컴퓨터: "+comInput+"("+com+")");

        int result = user - com;

        /*if(result == -2 || result == 1) {
            System.out.println("사용자 승");
        }
        else if(result == 2 || result == -1) {
            System.out.println("컴퓨터 승");
        }   
        else if(result == 0) {
            System.out.println("비김");
        }*/

        switch (result) {
            case 1:
            case -2:
                System.out.println("사용사 승");
                break;

            case -1:
            case 2:
                System.out.println("컴퓨터 승");
                break;

            case 0:
                System.out.println("비김");
                break;

            default:
                break;
        }

    }
}



















