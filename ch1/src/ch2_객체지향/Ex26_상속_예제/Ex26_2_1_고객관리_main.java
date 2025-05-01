package ch2_객체지향.Ex26_상속_예제;

/* 할일: 등급에 따른 고객 데이터 만들기

        일반등급(등급: 일반, 이름: 송유진, 고객번호 N-001, 보유포인트 100,  할인율: 5%)
        VIP등급(등급: VIP, 이름: 권이지, 고객번호 V-001, 보유포인트 10000, 할인율: 10%, 개인 상담사ID)

    - 예상 시나리오
        두 고객 모두 '고객번호', 이름, 등급, 할인율(일반 5%, vip 10%) 에 대한 정보를 가지고 있어야 함
        VIP 한테만 개인 상담사('상담사id') 가 있음.

    - 출력:
        일반고객 - showCustomerInfo() - XXX 님의 등급은 XX 이고, 보너스 보인트는 XX 입니다.
        vip - CustomerInfo() - XXX 님의 등급은 XX 이고, 보너스 보인트는 XX 입니다. 상담사ID는 XXXXX 입니다
-----------------------------------------------------------------------------

    - 각 회원마다 돈이 얼마씩 있음.
    - 얼마 지불했는지 카드에서 차감
    - 할인율 만큼 포인트에 적립해줌
    - 출력: XXX님 XXX원 사용
            보유포인트는 XXX점

 */
public class Ex26_2_1_고객관리_main {
    public static void main(String[] args) {
        // 등급: 일반, 이름: 송유진, 고객번호 N-001, 보유포인트 100,  할인율: 5%
        Ex26_2_2_Customer c1 = new Ex26_2_2_Customer();
        c1.setCustName("송나라송");
        c1.setCustId("N-001");
//        System.out.println(c1);
        c1.showCustomerInfo();

        System.out.println("-------------------------");
        Ex26_2_2_Customer c2 = new Ex26_2_2_Customer("장피에르", "N-999");
//        System.out.println(c2);
        c2.showCustomerInfo();

        System.out.println("-------------------------");
        Ex26_2_2_Customer c3 = new Ex26_2_2_Customer("홍형석", "N-002", 100000);
//        System.out.println(c3);
        c3.showCustomerInfo();


        System.out.println("-------------------------");
        System.out.println("-------------------------");

        Ex26_2_3_VipCustomer v1 = new Ex26_2_3_VipCustomer();
        v1.setCustName("권일진");
        v1.setCustId("V-001");
        v1.setCustId("V-001");
        v1.setAgentId("A_19호");
        System.out.println(v1);

        v1.setCurrMoney(10000000);
//        System.out.println(v1);
        v1.showCustomerInfo();

    }
}





























