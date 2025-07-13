package 종합.과제5.model.dao;

import 종합.과제5.model.dto.WaitingDto;

public class WaitingDao {
    // (2)싱글톤 만들기
    private WaitingDao(){}
    private static final WaitingDao dao = new WaitingDao();
    public static WaitingDao getInstance(){
        return dao;
    }
    //(8) 여러개 dto를 저장하는 배열선언한다.<DB 사용시 생략>
    private WaitingDto[] waitingDB = new WaitingDto[100];

    //(9) 등록기능 addWaiting(){}
    public boolean addWaiting( String phone , int count ) {
        boolean result = false; //실패시
        // 객체생성
        WaitingDto waitingDto = new WaitingDto(phone, count);
        for (int i = 0; i < waitingDB.length; i++) {
            if (waitingDB[i] == null) { // waitingDB에 i번째가 비어있으면
                waitingDB[i] = waitingDto; //waitingDB에 i번째에 데이터대입
                result = true; // 성공시
                break;
            }
        }
        return result;
    }
    public WaitingDto[] getWaitingList(){
        return waitingDB;
    }
    public WaitingDto[] waitingPrint(){
        return waitingDB;
    }
}//class e
