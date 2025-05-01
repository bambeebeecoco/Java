package ch1;

import java.util.Scanner;

/*할일: -1 넣기 전에 계속 입력받기
        만원 이상 구매시 10%
        5만원 이상 구매시 20%

        -출력-
            전체 상품 금액:
            할인율
            할인 금액
            최종 금액

*/
public class Ex016_마트할인 {
    public static void main(String[] args) {

        int total = 0;
        System.out.println("가격을 입력하시오");
        Scanner sc = new Scanner(System.in);

        while (true){
            int input = sc.nextInt();
            if (input == -1){
                break;
            }
            total += input;
        }
        System.out.println("=======");
        System.out.println("total: " + total);

        int dis = 0;
        if (total > 50000){
            dis = 20;
        }
        else if (total >= 10000){
            dis = 10;
        }
        double sale_price = total * 0.1;
    }

}
