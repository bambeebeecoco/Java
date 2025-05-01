package ch99_연습;

/*
    인터페이스 (interface)
        - 무언가와 무언가가 소통하거나 연결되기 위한 약속이나 규칙
        - 프로그래밍에서 인터페이스는 클래스나 객체가 어떤 기능(메서드)을 제공할것인지 정해놓은 틀이다
            하지만 작접 기능을 구현하지 않고 어떤 기능이 있어야 한다고만 정해놓는 역할

       정의 : 메서드 이름만 적혀있고 내용은 없음
       목적 : 구현 클래스가 반드시 이 기능을 만들게 강제함
       유연성 : 클래스가 여러 인터페이스를 동시에 구현 가능
       상태 없음 : 인터페이스는 변수나 상태를 갖지 않음 (java 기준 기본적으로 final static 상수만 가능)


       언제 인터페이스를 사용하나?
        - 공통된 기능을 강제하고 싶을 때
        - 다양한 클래스가 같은 규칙을 따라야 할때
        - 여러 클래스에서 일관된 동작을 기대할 때
        - 다형성 (Polymorphism)을 활용할때

       장점
        - 다양한 클래스에 같은 규칙 적용
        - 코드의 일관성 유지

        인터페이스 안에서는 모든 메서드는 자동으로 public abstract 이다.

        **
        ✓ 인터페이스는 인스턴스 변수(필드)를 가질수 없다
          why?
            인터페이스 안에서 선언되는 모든 변수는 자동으로
            public static final
            즉, 공개된 상수가 된다
            인터페이스는 "설계도","규칙서"이기 때문입니다.
                - "어떤 기능(메서드)이 있어야 하는가" 만 정의하고, "어떻게 동작하고 어떤 데이터를 가질 것인가"는 구현체 (클래스) 가 정해야한다
                -> 즉, 이런 동작은 꼭 있어야해! 라고 말할수 있있지만 실질적인 값이은 이렇게 저장하라고 지정할수없는것이 인터페이스

       상태는 구현클래스가 결정하고 저장한다


                 인터페이스    vs     추상클래스
       목적 :    '기능'을 강제        공통 기능 + 일부 강제
   구현 내용 :  없음 (전부 구현해야함)   일부 구현 가능
   다중 상속 :       가능             불다능 (단일 상속만 가능)
    상속 예 :    규칙만 정할때          공통 코드 공유 + 규칙 필요할때

    >> 인터페이스 "이 기능은 무조건 넣어!"
    >> 추상클래스 "공통기능 줄게~ 나머지는 알아서 해~"

인터페이스가 인스턴스변수를 가질수없는 이유
>> 인스턴스화를 해야만 사용할수 있는게 인트선스 변수
    상수



*/

interface Animal2 {
    public abstract void sound(); //public abstract 생략 가능
}

class Dog implements Animal2 {
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat implements Animal2 {
    public void sound(){
        System.out.println("야옹");
    }
}

public class Ex99_인터페이스  {
    public static void main(String[] args) {

        //다형성을 이용해 Animal2 타입으로 선언
        Animal2 dog = new Dog();
        Animal2 cat = new Cat();

        dog.sound();
        cat.sound();

        Animal2[] animal2s = { new Dog(), new Cat()};
        /*향상된 for문
        for (Animal2 a : animal2s){
            a.sound();
        }
         */
        for (int i = 0; i < animal2s.length; i++) {
            animal2s[i].sound();
        }
    }
}
