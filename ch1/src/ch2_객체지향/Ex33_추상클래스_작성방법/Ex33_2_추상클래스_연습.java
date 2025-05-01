package ch2_객체지향.Ex33_추상클래스_작성방법;

/*
    할일: AI 자동차, 메뉴얼 자동차 두 종류가 있음
        모든 자동차는 '시동걸기(turnOn), 운행(drive), 멈춤(stop), 시동끄기(turnOff)' 기능들이 있고
        시동 걸기, 끄기는 모든 차가 동일한 이름으로 메서드를 가지고 있음

    -출력
        시동걸기: 사람이 시동을 겁니다
        운행: 사람이 운전합니다
        멈춤: 사람이 브레이크를 밟습니다
        시동끄기: 사람이 시동을 끕니다

        시동걸기: 자동차가 시동을 겁니다
        운행: 자율주행
        멈춤: 스스로 멈춤
        시동끄기: 자동차가 시동을 끕니다
*/

abstract class Car {
    void drive(){}
    void stop(){}

    void turnOn(){}
    void turnOff(){}
}

class AiCar extends Car {

}
class MenuallCar extends Car {

}

public class Ex33_2_추상클래스_연습 {
}
