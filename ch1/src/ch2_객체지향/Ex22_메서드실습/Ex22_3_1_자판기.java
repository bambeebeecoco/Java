package ch2_객체지향.Ex22_메서드실습;

/** 할일: 자판기 클래스를 만들어서 음료 자판기를 만들어보기
 *      (음료 id: 1-콜라, 2-사이다, 3-포도맛판타, 4-포카리)
 *      
 *      - 기능
 *          1) 어떤 버튼이 눌렸는지 감지하는 메서드 - pushProductButton()
 *              출력: XX 버튼이 눌렸습니다.
 *          2) 출력기능: '구매하신 음료는 XXX 입니다.' - toString()
 *          --------------------------------------------------------
 *          3) 새로운 자판기 만들어서 1번 자판기와 2번 자판기 구분 되도록 하기
 *              ('X번 자판기 - 구매하신 음료는 XXX 입니다.')
 */
public class Ex22_3_1_자판기 {
    private String vName;
    String drink = "";
    
    /* 생성자로 vName 세팅 하는 방법 */
    public Ex22_3_1_자판기() {
        this.vName ="이름 없음";
    }

    public Ex22_3_1_자판기(String vName) {
        this.vName = vName;
    }
    /* setter 로 vName 세팅하는 방법 */
    public void setvName(String vName) {
        this.vName = vName;
    }

    public void pushProductButton(int menuId) {

        System.out.println(vName+" - "+menuId + "번 버튼이 눌렸습니다.");

        if(menuId == 1) {
            drink = "콜라";
        }
        else if(menuId == 2) {
            drink = "사이다";
        }
        else if(menuId == 3) {
            drink = "포도맛판타";
        }
        else /* if(menuId == 4) */ {
            drink = "포카리";
        }
    }

    @Override
    public String toString() {
        return vName + " - 구매하신 음료는 '"+drink+"' 입니다.";
    }
}
