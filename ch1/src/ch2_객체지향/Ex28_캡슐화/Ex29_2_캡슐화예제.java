package ch2_객체지향.Ex28_캡슐화;


/*
    할일: 시분초를 받는 클래스를 만들고
        시: 0~23
        분: 0~59
        초: 0~59
        범위 내으 숫자만 받을수 있도로  하기
        (만약 잘못된 범위의 숫자가 들어오면 0으로 넣기)
*/

import java.util.Scanner;

class Time {
    private int hour;
    private int min;
    private int sec;

    /* 생성자로 하는 경우 */
    public Time() {}
    public Time(int hour, int min, int sec) {
        if(hour < 0 || 23 < hour ) {
            hour = 0;
        }
        this.hour = hour;

        if(min < 0 || 59 < min ) {
            min = 0;
        }
        this.min = min;

        if(sec < 0 || 59 < sec ) {
            sec = 0;
        }
        this.sec = sec;
    }


    /* setter 로 하는 경우 */
    public void setHour(int hour) {
        if(hour < 0 || 23 < hour ) {
            hour = 0;
        }
        this.hour = hour;
    }

    public void setMin(int min) {
        if(min < 0 || 59 < min ) {
            min = 0;
        }
        this.min = min;
    }

    public void setSec(int sec) {
        if(sec < 0 || 59 < sec ) {
            sec = 0;
        }
        this.sec = sec;
    }

    //comand+n >> toString() 으로 만들면된다
    @Override
    public String toString() {
        return hour+":"+min+":"+sec;
    }
}
public class Ex29_2_캡슐화예제 {
    public static void main(String[] args) {
        /* 생성자로 하는 경우 */
        Time t1 = new Time(12, 35 , 30);
        System.out.println(t1);

        /* setter 로 하는 경우 */
        Time t2 = new Time();
        t2.setHour(23);
        t2.setMin(59);
        t2.setSec(60);
        System.out.println(t2);

        /* 사용자에게 직접 입력 받아서 하는 경우 */
        Scanner sc = new Scanner(System.in);
        System.out.print("시 입력하시오: ");
        int hour = sc.nextInt();
        System.out.print("분 입력하시오: ");
        int min = sc.nextInt();
        System.out.print("초 입력하시오: ");
        int sec = sc.nextInt();

        Time t3 = new Time(hour, min , sec);
        System.out.println(t3);
    }
}