package ch1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/* 할일: -1 넣기 전까지 계속 입력 받기
        만원 이상 구매시 10%
        5만원 이상 구매시 20%

    -출력-
        전체 상품 금액: XXXX원
        할인율: XX%
        할인 금액: XXX원
        최종 금액: XXXXX원


 */
public class Ex17_마트할인 {
    public static void main(String[] args) {

        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("아이템 가격을 입력하시오: ");

        while(true) {
            int input = sc.nextInt();
            if(input == -1) {
                break;
            }
            total += input;
        }
        System.out.println("==================");

        System.out.println("total: " + total);

        int discount = 0;
        if(total >= 50000) {
            discount = 20;
        }
        else if(total >= 10000) {
            discount = 10;
        }
        double sale_price = total * (discount / 100.0);
        double final_price = total - sale_price;

        System.out.println("discount: " + discount);
        System.out.println("전체 상품 금액: "+total+"원");
        System.out.println("할인율: "+discount+"%");
        System.out.println("할인 금액: "+sale_price+"원");
        System.out.println("최종 금액: "+final_price+"원");
        System.out.println("---------------------------");

        DecimalFormat df = new DecimalFormat("###,###");
        System.out.println("전체 상품 금액: "+ df.format(total) +"원");
        System.out.println("할인율: "+df.format(discount)+"%");

        String nf = NumberFormat.getNumberInstance().format(sale_price);
        System.out.println("할인 금액: "+ nf +"원");

        System.out.println("최종 금액: "+String.format("%,.0f", final_price)+"원");



    }
}













