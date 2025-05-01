package ch99_연습;
/*
    -자료형
        인스턴스를 생성하게 되면 heap 영역에 저장되는데, heap 영역에는 string pool 이라는 영역이 따로 있다.
        1) 리터럴한 값 (기본자료형)들은 string pool 영역에 저장되서 공유되고
            만약 같은 값을 여러 변수에 저장하면 같은 주소 값을 공유할뿐 새로운 값을 생성하지 않는다.
        2) new 를 이용해서 생성하는 (참조자료형) 같은 경우는 그냥 heap 영역에 저장이 된다.

    1) 기본자료형 (primitive type)
        논리형: boolean
              기본값 :false
        문자형: char

        정수형:
            byte
            short
            *int
            *long

        실수형:
            float: 0.0f
            double: 0.0

    2) 참조자료형 (Reference type)
        기본자료형을 제외한 모든 자료형을 말한다.
        ex) Main3 m3 = new Main3();

        클래스이름 변수이름 =new 클래스이름();
        // new 뒤의 클래스 이름은 사실 해당 클래스의 생성자

        대표적으로 String 이 있다
        String name = new String();

    3) 자료형 확인 - 자료형 확인시 Wrapper 클래스 타입으로된 변수들을 class 클래스의 getClass() 와 getName() 를 이용해서 확인한다


    -변수
        변수란 값을 저장할 수 있는 박스(공간)을 의미한다.
        하나의 변수에 하나의 형태의 값만 저장할 수 있다.

    -변수의 종류
        1) 클래스 변수
        2) 인스턴스 변수
        3) 지역 변수
        4) 메개 변수

*/

public class Ex02_변수와자료형 {
}
