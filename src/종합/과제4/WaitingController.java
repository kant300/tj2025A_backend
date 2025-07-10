package 종합.과제4;

// (2) 컨트롤러 : 기능/제어
public class WaitingController {
// 1. 멤버변수
    private static final Waiting[] waitings = new Waiting[100];
// 2. 생성자
// 3. 메소드
// 3-1. 대기 등록 기능 메소드
    public static boolean addWaiting( String phone, int count ) {
        //매개변수로 받은 값들을 Waiting 클래스의 생성자에 전달하여 객체를 생성합니다.
        Waiting waiting = new Waiting( phone , count );
        // waitings 배열의 빈 공간을 찾아 생성된 객체를 저장
        for ( int i = 0 ; i <= waitings.length - 1 ; i++ ) {
            if ( waitings[i] == null ) {
                waitings[i] = waiting;
                return true;
            }
        }// for e
        return false;
    } //func e
// 3-2. 대기 조회 기능 메소드


    public static Waiting[] getWaitingList() {
        return waitings;
    }
} // class e
