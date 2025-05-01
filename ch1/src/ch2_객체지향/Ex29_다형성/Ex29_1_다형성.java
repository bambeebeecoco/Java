package ch2_객체지향.Ex29_다형성;

/*
    다형성 - 객체지향에서 제일 중요!
            (이거 이해 못하면 자바 이해못한거)

            조상 타입의 참조 변수로 자손 타입 객체를 담아서 사용
            ex) 1) 일반적인 객체 생성
                    Tv t = new Tv();
                2) 다형성 객체 생성
                    Tv가 조상클래스, 스마트 Tv가 자손 클래스라고 치면 아래처럼  사용가능
                    Tv t = new SmartTv();
                    (t는 조상 타입의 참조 변수, 스마트 tv는객체 타입)

                    SmartTv t = new Tv(); << 이건 안댐
                *Tv 클래스로 만든 t가 리모콘이라고 치고, Tv 클래스에는 3개의 기능(전원, 볼륨, 채널)이 있다.
                SmartTv는 Tv를 상속받아서 추가로 한개의 기능(넷플릭스)이 더 있다고 가정하자

                수리센터에서 t 리모콘 껍데이에 smartTv꺼 기판을 넣어주면, 기존 껍데이의 버튼3개는 모두 사용 가능하다.
                (스마트 티비의 넷플릭스 기능을 제외한 t리모컨의 원래 기능은 사용가능하다는 뜻)

                그러나 반대로 SmartTv껍데기에 Tv 기판을 넣어주면 SmartTv 껍데기에 있는 전원, 볼륨, 채널 버튼을 제외한 나머지는 동작하지 않는다
                (왜냐하면 그 안에 들어있는 기판에는 해당 기능이 없기 때문)

                *정리: 부모 타입 안에 자식 들어갈 수 있음

                *다형성 장점
                    1) 유지보수: 여러 체를 하나의 타입으로 관리 할 수있음
                    2) 재사용성: 객체의 재사용이 쉬어짐
                    3) 느슨한 결합도: 클래스간의 의존성을 줄여서 확장성을 높일수 있다 (결합도 낮아짐)

                    하나에 하나의 함수만 작성해주는것이 좋다요

                단점
                    부모는 자식의 기능을 사용할수가 없다

*/

class Tv { //(참조 자료형)
    boolean power; //꺼졌는지 켜졌는지 두가지 경우밖에 없어서 true/false 비교연산자를 사용 (기본자료형)
    int channel; //채널
    int volume; //볼륨

    void power(){
        power = !power; //처음 티비는 꺼져기때문에 전원은 꺼진 상태로 시작
        if(power) System.out.println("일반 Tv on");
        else System.out.println("일반 Tv off");
    }

    void ChannelUp(){
        System.out.println(++channel);
    }
    void ChannelDown(){
        System.out.println(--channel);
    }
    void VolumeUp(){
        System.out.println(++volume);
    }
    void VolumeDown(){
        System.out.println(--volume);
    }

}

//Tv 부모에 SmartTv의 자식의 속성을 상속해줌
class SmartTv extends Tv{
    boolean netflix;

    void ott(){
        netflix = !netflix;
        if (netflix) System.out.println("Smart Tv on");
        else System.out.println("Smart Tv off");
    }
}

public class Ex29_1_다형성 {
    public static void main(String[] args) {
        /*다형성 - 부모타입의 참조 변수 t에 자식 객체에 SmartTv(); 를 담았음
        그래서 t 로는 SmartTv의 기능이 아닌 Tv의 멤버들만 사용가능*/
        Tv t = new SmartTv();
        t.power();
        //t.ott(); // t리모콘 에는 ott버튼 자체가 없기 때문에사용 못함

        /*
        SmartTv stv = (SmartTv) new Tv(); //syntax 구문이 잘못되었다고 에러가 났다고뜬다
        stv.power();
        stv.ott();
        자식 타입의 변수에 부모 넣을수 없음
        코드에는 발간줄 안들아와도 컴파일 단계에서 에러난다
         */


    }
}
