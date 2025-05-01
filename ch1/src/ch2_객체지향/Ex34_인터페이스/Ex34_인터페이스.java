package ch2_객체지향.Ex34_인터페이스;

/*
    인터페이스란 추상메서드들의 집합(추상메서드와 상수만 멤버로 가질수 있다)
    (추상 클래스보다 강도가 쎈 추상화)

    *중요*
    추상클래스는  abstract 들어가는 메서드들도 가질수  있고, 일반 메서드들도 가질수 잇는데
    인터페이스는 전부 abstract 메서드여야만 한다.
    모든 멤버는 public 이여야 한다 (그래서 생략도 가능)
    다중상속 가능
    - 이유 : 같은 이름을 가지고 있는 메서드들이 여러 인터페이스들에 있어도 구현부가 없어서 충돌날 일이 없음

    interface 이름 {
        public static final 타입 상수명 = 값;
        public abstact 반환타입 메서드 이름([매개변수...])ㅣ;
    }

    - 인터페이스가 인터페이스 상속 받는 경우
    (인터페이스는 여러개를 '상속' 받을수 있음. 단, 인터페이스만 상속 가능)
        interface 이름 extends 인터페이스1, 인터페이스2, 인터페이스3 ... {}

    - 클래스를 인터헤이스를 이용해 구현(상속) 하는 경우
    클래스는 다른 클래스를 상속 받을수 있고(한번) 여러개의 인터페이스를 구현(implements) 할수도있다)
        class 이름 extends 부모클래스 implements 인터페이스1, 인터페이스2, 인터페이ㅅ3 ... {}
*/

interface Fightable {
    void move(int x, int y);
}
class Unit {
    int x, y;

    void stop() {
        System.out.println("멈춤");
    }
}
class 보병 extends Unit {
    void drug() {
        System.out.println("마약 사용 - 총 짱빨리쏨, 총 맞아도 아몰랑");
    }

    void attact() { System.out.println("공격 시작"); }


}

public class Ex34_인터페이스 {
}
