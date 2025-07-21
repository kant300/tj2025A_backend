package day16;

public class 실습14_7 {
    public static void pauseOneSecond() throws InterruptedException {
        //  InterruptedException    : 흐름을 중단되었을때 발생되는 정보를 저장하는 클래스
        Thread.sleep(1000); // 1초간 프로그램 일시정지

    }
    public static void main(String[] args) {
        try{ pauseOneSecond(); }
        catch ( InterruptedException e ) {
            System.out.println("[예외발생] sleep 도중에 오류 발생");
        }


    }//main e
}// class e
