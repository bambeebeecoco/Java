package ch2_객체지향.Ex22_메서드실습;

/** 할일: 식당 테이블오더 프로그램 작성
 *      각 메뉴(데이터)마다 이름(menuName)과 가격(price)
 *      
 *      0 넣을때까지 계속 찍기
 *
    1 - 쌀국수, 11000
    2 - 칼국수, 9000
    3 - 초밥, 14000
    4 - 오므라이스, 10000
    5 - 육회비빔밥, 12000
    6 - 도삭면, 10000
    7 - 샐러드, 12500
    8 - 돈까스, 13000
    9 - 제육, 10000
    10 - 돼지국밥, 12000
 *  
 *  - 출력
 *      선택한 메뉴는 XXX 이고, 가격은 XXX원 입니다.
 */
public class Ex22_4_1_테이블오더 {

    Menu[] menuPan = {
        new Menu("쌀국수", 11000),
        new Menu("칼국수", 9000),
        new Menu("초밥", 14000),
        new Menu("오므라이스", 10000),
        new Menu("육회비빔밥", 12000),
        new Menu("도삭면", 10000),
        new Menu("샐러드", 12500),
        new Menu("돈까스", 13000),
        new Menu("제육", 10000),
        new Menu("돼지국밥", 12000)
    };

    void printMenu(int num) {

        System.out.println("선택한 메뉴는 "+ menuPan[num-1].getMenuName() +" 이고, 가격은 "+  menuPan[num-1].getMenuPrice() +"원 입니다.");
    }
}

class Menu {
    private String menuName;
    private int menuPrice;

    public Menu(String menuName, int menuPrice) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                '}';
    }
}
















