package ch2_객체지향.Ex29_다형성;

class Parent {
    int x = 100;

    void tmp() {
        System.out.println("부모 메서드");
    }
}

class Child extends Parent {
    int x = 200; //멤버변수 같은 경우는 기본 적으로 들어가있는 "속성" 대놓고 보이는것 (예를 들어 아웃핏, 틀)


    void tmp() {
        System.out.println("자식 메서드");
    } // "기능" (예) on/ off ) 동작하는 기능을 갖은 메서드 안에는
    /* 자식의 tmp()가 주석 처리가 되어도 부모의 메서드 "기능"이 "상속"되어 p.tmp()에 부모메서드가 실행된다 */

}

public class Ex29_다형성_예제 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x: " + p.x); /* 부모한테 받은 속성을  */
        p.tmp(); /* 자식한테 있는 기능을 실행시킴 부모에게 있는 기능을 실행시키는 것이아 아니고 자식의 속성이 실행이된다*/
        System.out.println("c.x: " + c.x);
        c.tmp();
    }
}




