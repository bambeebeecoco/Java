package ch99_연습;

/*
    할일: 아메리카노, 라떼, 에이드 만드는 커피머신 어플리케이션 개발
        아메리카노 - 물을 섞습니다. / 아메리카노는 아아가 제맛
        라떼 - 우유를 섞습니다. / 우유는 스팀이 제맛
        에이드 - 탄산을 섞습니다. / 탄산은 탄산탄산

    - 출력:
        -- 머신이 동작합니다. --
        아메리카노는 물을 섞습니다.
        아메리카노는 아아가 제맛

        -- 머신이 동작합니다. --
        라떼는 우유를 섞습니다.
        우유는 스팀이 제맛

        -- 머신이 동작합니다. --
        에이드는 탄산을 섞습니다.
        탄산은 탄산탄산

    ==> 다형성의 작동원리,
        다형성의 핵심적 내용 이해하기
 */
class Coffee {
    String txt = "-- 머신이 동작합니다. --";
    public void makeDrink() { System.out.println(txt); }
}
class Americano extends Coffee {
    public void makeDrink() {
        System.out.println(txt + "\n아메리카노는 물을 섞습니다.");
        ahah();
    }
    public void ahah() { System.out.println("아메리카노는 아아가 제맛"); }
}
class Latte extends Coffee {
    public void makeDrink() {
        System.out.println(txt + "\n라떼는 우유를 섞습니다.");
        steam();
    }
    public void steam() { System.out.println("우유는 스팀이 제맛"); }
}
class Ade extends Coffee {
    public void makeDrink() {
        System.out.println(txt + "\n에이드는 탄산을 섞습니다.");
        soda();
    }
    public void soda() { System.out.println("탄산은 탄산탄산"); }
}


public class Ex99_6_커피머신 {
    public static void main(String[] args) {
        Ex99_6_커피머신 cm = new Ex99_6_커피머신();
        cm.makeBaverage(new Americano());
        System.out.println(" ");

        cm.makeBaverage(new Latte());
        System.out.println(" ");

        cm.makeBaverage(new Ade());
        System.out.println(" ");

    }

    public void makeBaverage(Coffee c) {
        c.makeDrink();
    }
}
































