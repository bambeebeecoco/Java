package ch99_연습;

/*
    (접근제어자) class 클래스이름 {
        멤버변수;
        메서드;
        }
 */

public class Ex20_클래스와_객체 {
    int studentId; //학번 //기본 자료형
    String studentName; //학생이름 //참조 자형
    int grade; //학년
    String address; //사는곳

    public void getStudent(int studentId, String studentName, int grade){
        studentName = "홍길동";
        studentId = 1002;
        grade = 2;

    }

    }



    //public static void main(String[] args) {
        //Ex020_클래스와_객체 tmp = new Ex020_클래스와_객체();

        //System.out.println("학생이름은: "+ tmp.studentName + "학번은: " +tmp.studentId+ "학년은: "+tmp.grade+"입니다.");




