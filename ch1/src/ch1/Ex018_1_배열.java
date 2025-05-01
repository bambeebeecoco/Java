package ch1;
/*
    배열
    배열 선언
        타입[] 변수명
        타입 변수명[]
        ([]는 어디에  붙던 상관없음)

      1) 선언만 하고 빈 방으로 두기
        int[]   변수명 = new int[]
      2) 선언과 동시에 값 초기화 하기 (값들을 저장)
        int[] 변수명 = {10, 20, 30}

        **중요
        배열은 메모리상 어딘가에 있는 실제값의 주소값을 참조할뿐임
*/

public class Ex018_1_배열 {
    public static void main(String[] args) {
        int[] num = new int[3];
        num[0] = 10;
        num[1] = 100;
        num[2] = 1000;

        System.out.println(num);  // [10,100,1000] 이 나오는게 아니라  [I@129a8472 >> 주소값이 나온다
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
    }
}
