package ch1;
/*
-자료형
    컴퓨터가 이해할수있는 값의 형태를 '자료형' 이라고 한다.
    (사람으 로 따지 면 문자, 숫자 같은것)
    자바에서의 자료형은 기본자료형 Primitive type 과 참고자료형 reference type 으로 구분한다

    인스턴스를 생성하게 되면 heap 영역에 저장되는데, 힙영역 안에는 스티링 풀이라는 영이 따로있다
    리터럴한 값들은 스트링 풀 영역에 저장되서 공유되고 만약 같은 값을 여러 변수에 저장하면 같은 주소값을 공유할뿐 새로운 값을 생성하지 않는다.
    new를 이용해서 생성하면 참조자료형 그냥 힙 영역에 저장된다

    기본자료형- Primitive type
            논리형: boolean (8bit = 1byte)
                    기본값 false
            문자형: char(16bit = 2byte)
                    기본값 '\u0000'
                    *주의: 따옴표. 문자 하나를의미
                    (이제부터 쌍타옴표는 스트링이 라는 자료형을 뜻함)
            정수형: byt, (8bite = 1byte), -128~127
                        기본값 = 0
                    short, (
                    Int
                    long
                    기본값 = 0L
            실수형
                flot
                double

    참조자료형- Reference type 객체 주소를 저장하한다
             기본료형을 제외한 모든 자료형을 말한다
             클래스 이름을 변수 타입을 쓰면 그게 다 참조변수 (이 부분 변수랑 클래스 부분 하면 이해댐)

             클래스 이름변수 = new 클래스이름(); // new 뒤에 클래스 이름은 사실 해당 클래스이름의 생성자임
             String 이 대표적인 예이다
                ex) String s = new String();

    자료형 확인 - 자료형 확인시 Wrapper 클래스 타입으로 된 변수들을 class 클래스의 getClass() 와 getName() 을 이용해서 함


    가비지 컬랙터
    메모리반환을 본인들이 시켜줌
    자바스크립트에서는 없어서 let으로 따로변수로 관리해줬지만 자바에서는 그럴 필요가 없다


*/
public class Ex003_자료형 {
    public static void main(String[] args) {
        int num= 0;
        System.out.println("num =" + num);
    }
}
