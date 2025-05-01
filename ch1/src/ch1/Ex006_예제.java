package ch1;

/* 할일: 변수의 사용법을 읽혀보자
    equals : object 클래 스에 들어있는 메서드
            보통 문자열 (string) 비교할때사용
            값만 비교
    == : 주소값 비교
        primitive 값 비교
*
* */

public class Ex006_예제 {
    public static void main(String[] args) {
        int i = 10;
        long l = 100;
        float f = 100F;

        System.out.println("i + l : " + (i + l));
        System.out.println("i + f : " + (i + f));

        char a = 'A';
        char c = 'A';

        System.out.println(c);
        System.out.println(c + i); //75
        System.out.println(a + c); //130 // 문자형(char)과 문자열형(string)은 다름
                                   // char 보다 int 가 더 크기때문에 둘이 +로 붙으면 A가 정수형 65로(아스키코드)로변환되서 10과 더해진다
        System.out.println("" + a + c);
        //System.out.println('' + a + c); << 이거 안댐
        // 문자로형으로 나오게 하려면 문자형은 만나서 +가 다음에 로 나오게하게하면댐

        //참조 자료형
        String txt1 = new String("Hello World");
        String txt2 = txt1;

        System.out.println(txt1.equals(txt2)); // 이제부터 문자열 비교는 == 가아니라  equals 로 비교

        String txt3 = "Hello World"; // 리터럴한 값
        // txt1은 객체로 만들어진 참조자료형 (heap 영역에 저장)
        // txt3은 리터럴한 값을 가지고 있는 일반형 (heap 안에 string pool 영역에 저장)

        String txt4 = new String("Hello World");
        System.out.println(txt1.equals(txt4));
        System.out.println(txt1 == txt4);
        // 둘다 힙 영역에 저장된건 맞지만 둘다 뉴로생성되었기 떄문에 따로따로 생성되기때문에 남남임
    }
}
