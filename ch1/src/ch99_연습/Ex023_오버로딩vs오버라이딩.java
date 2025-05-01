package ch99_연습;

/*
    오버로딩과 오버라이딩 중에 오버로딩 알아보기

    자바에서 메서드 이름이 같아도 매개변수의 개수나, 타입이 다르면 다른 메서드로 인식함
    이걸 이용해서 한 클래 스 내에 여러개의 같은 이름을 가진 메서드를 정으할수 있는데
    이걸 '메서드 오버로딩' 이라고 함

    - 오버로딩 장점
        비슷한 기능을 하는 메서드가 여러개라면 일일이 이름을 다 기억해야 하지만
        하나로 통일 하면 기억하기도 편하고 작업할때 이름을 헷갈려할 필요가 없다.
        그래서 오류의 가능성을 줄일수있다.

    - 오버로딩 조건
        1) 메서드 이름 같아야함
        2) 매개변수 개수와 타입이 달라야 함

    오버라이딩

*/

public class Ex023_오버로딩vs오버라이딩 {
    /*오버로딩
        -어떤날은 상자를 보내고
        -어떤날은 편지를 보내고
        -어떤날은 선물포장된 상자를 보낸다
     이 동작들은 다 "택배를 보낸다"라는 이름의 행동이지만 보내는 물건이 다르기 때문에 방법이 조금씩 다를 수 있다
     이것을 '오버로딩'이라한다
     */


    void sendPackage(String box){
        System.out.println("상자보내기");
    }
    void sendPackage(int boxId){
        System.out.println("박스 코드는 무엇이다");
    }
    //void sendPackage(String letter) 같은 매개변수 이름은 String이면 오류가 나니까 조심하도록한다
    void sendPackage(String box, String ribbon){
        System.out.println("선물포장 보내기");
    }


    /*오버라이딩
        -부모 회사가 만든 본사 장난감 가게에 기본적인 판매방법
        그런대 서울 지점은 서울지점에 맞는 판매방법을 쓰고 싶어함
        그래서 같은 이름의 판매방식이 있지만, 서울지점만의 방식으로 다시 만들어서 사용합니다
     부모 클래스에서 만든 기능(메서드)을 자식 클래스에 다시 정의 (재정의) 하는것을 오버라이딩
    */

    class ToyStore {
        void sell() {
            System.out.println("기본 판매 방식");
        }
    }

    class SeoulToyStore extends ToyStore {
        @Override
        void sell() {
            System.out.println("서울 지점만의 판매 방식");
        }
    }

    public void main(String[] args) {
        ToyStore t = new SeoulToyStore();
        t.sell();
    }
}

