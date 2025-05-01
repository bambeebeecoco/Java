package ch2_객체지향.Ex26_상속_예제;

public class Ex26_2_2_Customer {
    //등급: 일반, 이름: 송유진, 고객번호 N-001, 보유포인트 100,  할인율: 5%
    protected String custLv; // 등급
    protected String custName; // 이름
    protected String custId; // 고객번호
    protected int bonusPoint; // 보유포인트
    protected double bonusRatio; // 적립율
    protected int currMoney;

    public Ex26_2_2_Customer() {
        this.custLv = "일반";
        this.bonusPoint = 100;
        this.bonusRatio = 0.05;
        this.currMoney = 0;
    }

    public Ex26_2_2_Customer(String custName, String custId) {
        this.custName = custName;
        this.custId = custId;
        this.custLv = "일반";
        this.bonusPoint = 100;
        this.bonusRatio = 0.05;
        this.currMoney = 0;
    }
    public Ex26_2_2_Customer(String custName, String custId, int currMoney) {
        this.custName = custName;
        this.custId = custId;
        this.custLv = "일반";
        this.bonusPoint = 100;
        this.bonusRatio = 0.05;
        this.currMoney = currMoney;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustLv() {
        return custLv;
    }

    public void setCustLv(String custLv) {
        this.custLv = custLv;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCurrMoney() {
        return currMoney;
    }

    public void setCurrMoney(int currMoney) {
        this.currMoney = currMoney;
    }

    public void showCustomerInfo() {
        System.out.println('\''+custName+"' 님의 등급은 '"+custLv+"' 이고, 보너스 보인트는 "+bonusPoint + " 이고, 잔여금액은 " + String.format("%,d", currMoney) +" 입니다.");
    }

    @Override
    public String toString() {

        return "고객정보{" +
                "등급='" + custLv + '\'' +
                ", 이름='" + custName + '\'' +
                ", 아이디='" + custId + '\'' +
                ", 적립률=" + bonusRatio +
                ", 보너스포인트=" + bonusPoint +
                ", 보유금액=" + String.format("%,d",currMoney) +
                '}';
    }
}




























