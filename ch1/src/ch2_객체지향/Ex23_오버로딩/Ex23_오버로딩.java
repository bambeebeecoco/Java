package ch2_객체지향.Ex23_오버로딩;
    /* 할일: 오버로딩과 오버라이딩 중에 오버로딩 알아보기
            (오버라이딩은 나중에)

            자바 에서 메서드 이름이 같아도 매개변수나, 타입이 다르면 다른 메서드로 인식함
            이걸 이용해서 한 클래스 내에 여러개의 같은 이름을 가진 메서드를 정의할수 있는데
            이걸 '메서드 오버로딩'이라고 함

       - 오버로딩 장점
            비슷한 기능을  하는 메서드가 여러개라면 일일이 이름을 다 기억해야 하지만
            하나로 통일하면 기억하기도 편하고 작업할때도 이름을 헷갈려할 필요가 없다.
            그래서 오류으 가능성을 줄을 있다.

       - 오버로딩 조건
            1) 메서드 이름 같아야함
            2) 메개변수 개수와 타입이 달라야함

         *주의: 아래 두 메서드는 오버로딩이 성립하지 않는다(타입과 개수가 같음)

    */
public class Ex23_오버로딩 {
        int add (int a,  int b) { return a+b; }
        long add(long x, int y) { return x+y; }
        long add(int x, long y) { return x+y; }

        public static void main(String[] args){
            Ex23_오버로딩 tmp = new Ex23_오버로딩();
            System.out.println( tmp.add(10L, 20));
        }
}
