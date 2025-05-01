package ch99_연습;

/** 할거: 클래스를 이용해서 객체(인스턴스)를 생성할거임
 *       (중요한 부분 '한개의 클래스를 가지고' 어떻게 '여러개의 객체를 생성하는지' 봐야함)
 *
 *  - 객체 생성 방법
 *      클래스명 변수명 = new 클래스명()
 *      ex) Phone p = new Phone();
 *          해설: 변수 p 는 참조변수
 *               new 연산자를 이용해서 Phone 객체를 생성 한 후, p 에 객체의 주소값을 저장
 */
/** phone 클래스를 만들고, 메인 클래스에서 phone 클래스의 객체를 생성할거임
 * (생성시 각각 다른 속성값들을 갖도록 만들거임 - 갤럭시, 아이폰, 노키아....) */

class phone1 {
    //회사
    private String brand;
    //모델
    private String model;
    //색상
    private String color;
    //크기
    private int size;

    /*생성자 코드
        객체를 만들때 필요한 정보를 전달받기 위해
        아래 phone1 myPhone = new phone1("Samsung", "GalaxyS21", "Black", 6); 를 생성한다면
        this.brand = brand; 처럼 객체의 속성에 저장되는것이다
        () << 안에 들어가있는 변수는 생성자에 전달받는 값 (매개변수)
        this.brand << 객체의 실제 속성 내가 가진 맴버 변수, = brand 메서드에 전달받은 값

        this.속성 = 매개변수
        */
    public phone1(){}
    public phone1(String brand, String model, String color, int size){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
    }

    //getter
    public String getBrand() {return brand;}

    public String getColor() {return color;}

    public String getModel() {return model;}

    public int getSize() {return size;}

    //setter
    public void setBrand(String brand) {this.brand = brand;}

    public void setColor(String color) {this.color = color;}

    public void setModel(String model) {this.model = model;}

    public void setSize(int size) {this.size = size;}

    //동작하는 함수기능 매서드
    void call (String call){
        System.out.println(call);
    }

    @Override
    public String toString() {
        return "phone1{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
public class Ex_20_3_객체생성 {

}
