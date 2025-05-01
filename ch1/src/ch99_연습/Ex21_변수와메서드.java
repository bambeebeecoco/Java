package ch99_연습;
/*
    지역 변수 (local Variable)
        메서드나 생성자  안에서 선언되는 변수
        메서드가 실행될때 생성되고, 메서드가 끝나면 사라진다
        해당 메서드 안에서만 사용이 가능하다

    멤버 변수 (인스턴스 변수 Instance Variable)
        클래스 안, 메서드 밖에서 선언된 변수
        객체가 생성될때 만들어지고 메모리에서 사라질 때 같이 없어진다
        클래스 안의 모든 메서드에서 사용 가능하고, "this. 변수명" 으로 접근이 가능하다

    클래스 변수 (Static 변수, Class Variable)
        클래스 안, 메서드 밖에서 static 키워드와 함께 선언된다
        프로그램이 시작될때 딱 한번 만들어지고 끝날때 사라진다
        객체 없어도 클래스 이름으로 직접 접근할 수 있다

    ----

    메서드 (method)
        자바에서 메서드는 어떤 작업을 실행하는 코드 묶음이다
        어떤 입력을 받아서 정해진 방식대로 처리하고 결과를 내는것

        리턴타입 메서드이름(매개변수) {
            //실행할 코드
            return 결과;
        }
        [리턴타입] 결과로 어떤 값을 돌려주는지 (ex) int, String, void ...)
        [메서드이름] 그 기능의 이름
        [매개변수] 메서드가 돌려주는 결과
        [return] 최종결과를 돌려주는 코드 (없으면 void 사용)
*/

class Chef {
    public void makeKimchRice() {
        System.out.println("1. 밥을 준비 한다.");
        System.out.println("2. 김치를 볶는다.");
        System.out.println("3. 밥을 넣고 함께 볶는다.");
        System.out.println("4. 완성!");
    }
}

class Tmp {
    public int add(int a, int b){
        return a + b;
    }
}

public class Ex21_변수와메서드 {
    public static void main(String[] args) {
        //Chef cf = new Chef(); //요리사 객체 만들기
        //cf.makeKimchRice(); //요리사에게 요리 시키기

        System.out.println("=================");

        Tmp t = new Tmp();

        int result = t.add(3, 5);
        System.out.println("결과: " + result);


    }
}

