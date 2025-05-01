package ch1;

/* 할거: 출력하기
        출력 할때는 System.out.println(); 를 사용한다.
        (sout 이라고 치면 알아서 쳐짐)
 */

public class Ex005_출력 {
    public static void main(String[] args) {
        System.out.println(100); // 100
        System.out.println("100"); // 100
        System.out.println("============================");

        System.out.println(100+100); // 200
        System.out.println(100+"100"); // 100100
        System.out.println("100"+100); // 100100
        System.out.println("100"+"100"); // 100100
        System.out.println("============================");

        System.out.println(100+100+"100"); // 200100
        System.out.println("100"+100+100); // 100100100
        System.out.println("100"+(100+100)); // 100200
        System.out.println((100+100)+"100"); // 200100

        // 이건 주의. 자바스크립트, c, c++ 계열에서는 true가 1로 자동 형변환 되면 101이 출력되지만
        // 자바에서는 얄짤 없음. 걍 에러남
//        System.out.println(100 + true);
    }
}
