package ch2_객체지향.Ex21_변수와메서드;
/*
    변수와 메서드
    - 변수
        변수 종류: 종류를 결정짓는 요소는 변수를 선언한 위치
            - 클래스변수: 클래스영역에 있으면서 static 이 붙은것
                       클래스가 메모리에  올라갈때 생성
                       모든 인스턴스가 공통된 저장공간을 공유하기 때문에 공통적인 값을 유지해야 하는 경우 클래스 변수로 사용.
                       사용시 '클래스명.변수명' 형식으 로  사용
            - 인스턴스변수: 클래스 영역에  있는 변수
                         인스턴스화 될때 생성
                         각각의 인스턴스마다 "독립적인 값"을 사용 해야하는 경우.
            - 지역변수: 클래스 영역이 아닌곳 (메서드, 생성자)에 있는 변수

   - 메서드 (js 에서는 function)
        특정 작업을 수행하는 코드를 한군데에 묶어놓는것
   - 메서드 선언 방법
        메서드는 '선언부' 와 '구현부' 로 구성되어 있다
        선언부 => [접근제 한자] [static] 리턴타입 메서드이름 ([매개변수, ....])
                >> [] 는 생략이 가능하다
        구현부 => { 실행문 }
    ex) public void 이름(){}
        public String 이름(){
            ...
            return "문자열";
            }
*/

class CoffeeShop {
    int price; // 인스턴스 변수
    String name;

    public CoffeeShop(){}
    public CoffeeShop(int price, String name){
        this.price = price;
        this.name = name;
    }
    public void println(){
        System.out.println("커피가격:" + price + "원");
    }


}
/*
    인스턴스변수 (instance)
    when? 각 매장이 자기만의 커피가격을 가지고 있을때
    -객체가 생성될때 생성되고 각각 다른 특성을 가질수있다
*/

class CoffeeShop2 {
    static int total = 0; //클래스 변수
    public void sellCoffee() {
        total++;
    }

    public void println(){
        System.out.println("전체 판매량: " + total +"잔");
    }
}
/*
    클래스변수
    when? 전체 매장에서 공유하는 정보가 필요할때
    클래스 전체에서 하나만 존재하며 공유된다
*/

public class Ex21_1_변수와메서드 {
    /*
    public void makeCoffee (){
        int sugar = 2; //지역 변수
        System.out.println("설당 "+ sugar +"스푼 추가");
    }

        지역변수는 메서드(기능 함수)내에서만 존재하고, void 메서드이름 {} <<이 끝나면 사라짐
        잠깐 사용되는 변수가 지역변수
    */
    public static void main(String[] args) {
        CoffeeShop cs = new CoffeeShop(2000, "강남점");
        // class 를 main heap 에 올려서 출력할수있게 해준다음, ()안에 값을 넣어주는데 변수안에 받아줄수있는걸 넣어준다
        CoffeeShop2 cs2 = new CoffeeShop2();

        System.out.println(cs);

    }
}
