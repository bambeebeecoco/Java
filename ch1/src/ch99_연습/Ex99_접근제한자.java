package ch99_연습;

/*  접근제어자 (Access Modifier)
    접근제어자는 객체 지향 프로그래밍에서 "누가 이 변수나 함수(메서드)에 접근할 수 있는가?"를 정해주는 문지기 역할

    ----
    클래스 class - 하나의 방
        하나의 기능이나 개체를 나타내는 코드 단위

    패키지 package - 같은 집
        여러 클래스를 묶은 단위

    프로젝트 project - 전체 동네
        여러 패키지를 포함하는 전체
    ----

    public - 동네 누구나 와도 되는 공용 공원
        누구든지 접근 가능

    protected - 집 주민 + 친척만 들어올 수 있는 마당
        같은 패키지 또는 상속한 클래스에서 접근 가능

    default - 같은 집에 사는 사람들만 아는 공용공간
        접근 제어자를 아예 안 쓰면 같은 패키지 내에서만 가능

    private - 내 방 안의 일기장 처럼 나만 볼수있는거
        자기 클래스 안에서만 접근 가능

   ----

*/

class PupA {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;
}

public class Ex99_접근제한자 {
    public static void main(String[] args) {
        PupA pa = new PupA();

        System.out.println(pa.a); // 가능
        System.out.println(pa.b); // 가능
        System.out.println(pa.c); // 가능
        //System.out.println(pa.d); 불가능 같은 클래스 내에서만 사용 가능하기 때문에
        /*
        private 변수 직접 접근은 불가능하지만
        getter 는 읽기가 가능하고
        setter 를 사용하면 쓰기가 가능하다 (원한다면)
        */
    }
}
