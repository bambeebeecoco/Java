package ch99_연습;

import java.util.Scanner;

/* 할일: 개구리말 번역기 만들기

    한글로 입력된 문자열을 그 길이만큼 "개굴"로 바꾸기
    단, 공백은 그대로 유지되어야 함

    ex) 안녕 반가워 => 개굴개굴 개굴개굴개굴

 */
public class Ex99_4_개구리말_번역기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("한국말을 입력하시오");
        String str = sc.nextLine();

        // 안녕 반가워
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                s += " ";
            }
            else {
                s += "개굴";
            }
        }
        System.out.println(s);
    }
}





