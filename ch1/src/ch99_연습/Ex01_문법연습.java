package ch99_연습;

public class Ex01_문법연습 { // .java 파일안에 public class는 하나만 있어야한다
    public static void main(String[] args) {

        System.out.println("Hello");
        int num = 10;
        System.out.println(num);
        Main3 m3 = new Main3();
        m3.ttt();
    }
}
class Main3{
    void ttt(){
        System.out.println("Hello java");
    }
}
/*
    class는 여러개 만들 수 있음
    메서드는 클래스 내부에 만드는것이며
    메서드는 리턴 타입을 명시해줘야한다.

    java 파일 안 에는 public 을  가지고 있는 클래스가 하나 있어야 함
    (java 파일 안에 class가 여러개 일수도 있지만, public을 달고 있는 클래스는 무조건 한개)
    클래스의 이름의 첫 글자는 대문자로 생성
    클래스 이름 뒤에는 () 괄호쓰지 않음 {} 써야함
    메서드는 클래스 내부에 생성
        public static 은 생략가능
    클래스 내부에서 필드와 메소드만 쓸수 있음
    메서드 생성시 리턴 타입을 명시해야한다
    void 메서드이름(), String 메서드이름(), int 메서드이름()
    void - 리턴 없음.
    String - 문자형
    int - 정수

*/