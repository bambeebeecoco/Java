package ch99_연습;

/*
    매개변수
    메서드가 실행되기 전에 필요한 정보를 받아들이는 변수
    메서드가 어떤 입력값을 받아서, 그걸 사용하거나 계산하기 위해 필요
*/

class Greeter{
    public void sayHello(String name){
        System.out.println("안녕하세요, " + name + "님");
    }
}

public class Ex99_매개변수 {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.sayHello("송나라 송");
        g.sayHello("장 망나뇽");
    }
}
