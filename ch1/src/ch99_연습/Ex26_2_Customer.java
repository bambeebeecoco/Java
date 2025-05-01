package ch99_연습;

/* 할일: 등급에 따른 고객 데이터 만들기
        
        일반등급(이름: 송유진, 고객번호 N-001, 보유포인트 100)
        VIP등급(이름: 권이지, 고객번호 V-001, 보유포인트 10000)
    
    - 예상 시나리오
        두 고객 모두 '고객번호', 이름, 등급, 할인율(일반 5%, vip 10%) 에 대한 정보를 가지고 있어야 함
        VIP 한테만 개인 상담사('상담사id') 가 있음.

    - 출력: XXX 님의 등급은 XX 이고, 보너스 보인트는 XX 입니다.
 */

//고객에게 공통적으로있는 속성으로 클래스를 만들기
class customer {
    private void  clevel() {
        System.out.println("등급은: ");
    }
    private void cName() {
        System.out.println("고객님 이름은: ");
    }
    private void cNo() {
        System.out.println("고객번호는: ");
    }
    private void cPoint() {
        System.out.println("보유포인트는: ");
    }
    private void cDiscount(){
        System.out.println("할인율: ");
    }

}

public class Ex26_2_Customer {

    public static void main(String[] args) {
        //showCustomerInfo()


    }
}
