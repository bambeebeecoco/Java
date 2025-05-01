package ch2_객체지향.Ex27_1_접근제한자;

/*
    (상속 개념부터 알고 와야함)

    -접근 제어자 / 접근 제한자
        접근제한자란?
            접근제한자는 변수, 메서ㄷ, 생성자에 대한 접근 권한을 지정하는 역할을 함
            클래스의외부에서 클래스 내부의 멤버 변수, 메서드, 생성자에 접근할 수 있는지 여부를 지정하는 키워드임
            객체의 속성들에 대한 잘못된 접근을 막기 위해 사용된다.
    -접근 제어자 종류
        **1) private: 같은 클래스 내부에서만 접근가능 (외부 클래스, 상속관계인 쿨래스에서도 접근 불가)
        2) default: 같은 패키지 내부에서만 접근 가능 (상속관계여도 다른 패키지에 있으면 접근 불가)
        3) protected: 같은 패키지나 상속 관계에서는 접근가능
                     (필드,
        **4) public: 클래스의 내외부 어디서든 접근 가능
                    ex) public 송유진_핸드폰; //누구든 가지고 갈수있다
*/

public class Ex27_1_접근제한자 {
    private String pri = "private";
    /*default*/ String def = "default";
    protected String pro = "protected";
    public String pub = "public";

    public void printMembers() {
        System.out.println(pri);
        System.out.println(def);
        System.out.println(pro);
        System.out.println(pub);
    }
}

    class SS1 {
        public static void main(String[] args) {
            Ex27_1_접근제한자 tmp = new Ex27_1_접근제한자();
            //포함관계 변수 tmp 는 main의 포함관계지만 tmp 안에는 주소값만 들어가있다
            tmp.printMembers();

            //System.out.println(tmp.pri); 같은 클래스 내부에서만 접근 가능하기때문에 오류남
            System.out.println(tmp.def);
            System.out.println(tmp.pro);
            System.out.println(tmp.pub);
        }
    }

