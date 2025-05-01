package ch2_객체지향.Ex26_상속_예제;

public class Ex26_2_3_VipCustomer extends Ex26_2_2_Customer {

    private String agentId;

    public Ex26_2_3_VipCustomer() {
        this.custLv = "VIP";
        this.bonusPoint = 10000;
        this.bonusRatio = 0.1;
        this.currMoney = 0;
    }
    public Ex26_2_3_VipCustomer(String custName, String custId) {
        this.custName = custName;
        this.custId = custId;
        this.custLv = "VIP";
        this.bonusPoint = 10000;
        this.bonusRatio = 0.1;
        this.currMoney = 0;
    }
    public Ex26_2_3_VipCustomer(String custName, String custId, int currMoney) {
        this.custName = custName;
        this.custId = custId;
        this.custLv = "VIP";
        this.bonusPoint = 10000;
        this.bonusRatio = 0.1;
        this.currMoney = currMoney;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
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
                ", 상담사='" + agentId + '\'' +
                '}';
    }
}





























