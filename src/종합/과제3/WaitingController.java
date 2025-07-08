package 종합.과제3;

// WaitingCotroller : 관리/제어
public class WaitingController {
    // 1. Waiting 객체를 100개 저장할 수 있는 배열을 멤버변수
    Waiting[] waitings = new Waiting[100];
    // 2. 메소드
    // 2-1. 등록 기능 메소드 (저장 성공 시 true, 실패(공간 없음) 시 false를 반환(return)합니다.)
    boolean addWaiting( String phone , int count ) {
        Waiting waiting = new Waiting();// Waiting 객체를 생성
        waiting.phone = phone; //매개변수로 받은 값들을 객체의 멤버 변수에 저장
        waiting.count = count;
        // waitings 배열의 빈 공간(null)을 찾아 생성된 객체를 저장
        for( int index = 0 ; index <= waitings.length - 1 ; index++ ) {
            if( waitings[index] == null ) { // 만약에 index번째 요소의 값이 null 이면
                waitings[index] = waiting; // index번째에 생성한 객체를 대입
                return true;    // 저장 성공시 true
            }
        } // for e
        return false;  // 실패(공간 없음)시 false를 반환(return)
    } // func e

    // 2-2 조회 기능 메소드
    Waiting[] getWaitingList() {
        return waitings;
    }




}
