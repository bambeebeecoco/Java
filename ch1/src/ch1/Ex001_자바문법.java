package ch1;

public class Ex001_자바문법 {
    /*
        1) java 파일 안에는 public 을 가지고 있는 클래스가 하나 있어야 함
            (java파일 안에 class가 여러개일수도 있지만, public을 달고 있는 클래스는 무조건 한개)
        2) 클래스의 이름의 첫 글자는 대문자로 생성
        3) 클래스 이름 뒤에 () 괄호 쓰지 않음. {} 괄호 써야함
        4) 메서드는 클래스 내부에 생성
            public static 은 생략 가능.
        5) 클래스 내부에는 필드와 메소드만 쓸 수 있음(필드와 메소드에 관련된건 추후 수업에서 할거임)
        6) 메서드 생성시 리턴타입을 명시해야 한다.
           void 메서드이름(), String 메서드이름(), int 메서드이름()
           void - 리턴 없음, String - 문자열, int - 정수.
           (자료형 이따가 할거임)
        7) 모든 작업이 끝날때마다 ; 필수

     */
    public static void main(String[] args) {  // <<== main 메소드
        System.out.println("여기"); // <<== System 처럼 맨 앞글자가 대문자면 '클래스'
        // println("1111") 처럼 () 괄호 붙어 있으면 '메서드'
        // out 처럼 첫글자가 대문자도 아니고 () 괄호도 붙어있지 않으면 '필드'
        int num = 10;
        System.out.println(num);

        Main3 m3 = new Main3();
        m3.ttt();
    }
}
class Main3 {

    void ttt() {
        System.out.println("저기");
    }
}