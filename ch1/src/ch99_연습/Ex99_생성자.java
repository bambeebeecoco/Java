package ch99_연습;

/*
    생성자 (Constructor)
    - 객체를만들때 자동으로 호출되는 특수한 매서드
        java에서 객체를 만들기 위해 new 키워드를 사용할때,
        그 객체를 초기화해주는게 바로 생성자다.

   생성자 종류
    - 기본생성자 (Default Constructor)
        초기값 없이 객체 생성
    - 매개변수 생성자 (Parameterized Constructor)
        특정 값을 주고 객체 초기화
    - 복사 생성자 (Copy Constructor)
        기존 객체의 내용을 복제
    - private 생성자
        객체의 내용을 생성하고 제어

    ------------------------------

    생성자의 중요한 역할
     1) 초기화 : 클래스 안의 변수들을 기본 값이나 원하는 값으로 세팅
     2) 안전성 : 객체가 완전히 준비돤 상태로 존개하게 보장함
     3) 편의성 : 객체 생성 시  다양한 방식으로 초기 설정을 할 수 있도록 지원

     오버로딩 (Overloading): 같은 이름의 생성자를 여러개 만들 수 있음
     상속 관계에서의 생성자: 부모 클래스의 생성자를 호출해서 초기화할 수 있음

*/


class Person {
    String name;
    //생성자
    Person(String name){
        this.name = name; // this는 현재 객체를 의미
    }
}


public class Ex99_생성자 {

    public static void main(String[] args) {
        Person p = new Person("송유진");
    }
}
