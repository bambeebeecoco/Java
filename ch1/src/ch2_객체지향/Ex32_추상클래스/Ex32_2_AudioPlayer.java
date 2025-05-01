package ch2_객체지향.Ex32_추상클래스;

/** 할일: 음악재생기 관련 프로그램 만들기
 *
 *  카세트테이프 - 테이프
 *  CD 플레이어 - CD
 *  MP3 플레이어 - 음악 파일
 *
 * */

abstract class Player {
    boolean pause;
    int currPos;

    // 생략 가능 - 별도로 명시하지 않으면 기본값 - false , 0 으로 세팅됨
//    public Player() {
//        this.pause = false;
//        this.currPos = 0;
//    }

    abstract void play() ;
    abstract void stop() ;
}

class Tape extends Player {
    void play() {
        System.out.println("카세트 테이프가 실행 됩니다.");
    }
    void stop() {
        System.out.println("카세트 테이프가 정지 됩니다.");
    }
}

class CdPlayer extends Player {

    void play() {
        System.out.println("CD 플레이어가 실행 됩니다.");
    }
    void stop() {
        System.out.println("CD 플레이어가 정지 됩니다.");
    }
}

class Mp3Player extends Player {

    void play() {
        System.out.println("MP3 Player가 실행 됩니다.");
    }
    void stop() {
        System.out.println("MP3 Player가 정지 됩니다.");
    }
}

public class Ex32_2_AudioPlayer {
    public static void main(String[] args) {
        Player p1 = new Tape();
        Player p2 = new CdPlayer();
        Player p3 = new Mp3Player();

        Ex32_2_AudioPlayer ap = new Ex32_2_AudioPlayer();
        ap.싫어요(p1);
        ap.싫어요(p2);
        ap.싫어요(p3);
    }

    void 싫어요(Player p) {
        p.play();
    }
}


