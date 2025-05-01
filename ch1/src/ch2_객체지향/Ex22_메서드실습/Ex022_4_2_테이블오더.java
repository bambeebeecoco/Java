package ch2_객체지향.Ex22_메서드실습;

public class Ex022_4_2_테이블오더 {

    Menu[] menuPan = {
            new Menu("아메리카노", 4800),
            new Menu("카페라떼", 5100),
            new Menu("카페모카", 5500),
            new Menu("카라멜마키야토", 5400),
            new Menu("돌체라떼", 5600)
    };

}

class drink {
    private String menuName;
    private int menuPrice;

    public drink(String menuName, int menuPrice){
        this.menuName = menuName;
        this.menuPrice = menuPrice;
    }
}


    //public String getMenuName() { return menuName; }
    //public void setMenuNam(String menuName) { this.menuName = menuName;}