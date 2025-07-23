package 종합.과제8.controller;

import 종합.과제8.model.dao.WaitingDao;
import 종합.과제8.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    // (*)싱글톤
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }

    // (*) Controller는 Dao만 호출 할 수있다. dao 싱글톤 호출
    private WaitingDao waitingDao = WaitingDao.getInstance();
    // (1) 등록기능 구현
    public boolean waitingWrite( String wphone , int wcount ) {
        // 1. 유효성 검사( 패스 )
        // 2. 데이터문제 없으면 묶음(객체) 하나로 만들기
        // --> 주의할점 매개변수와 동일한 생성자가 존재하지 않으면 오류 발생한다.
        WaitingDto waitingDto = new WaitingDto( 0 ,wphone , wcount );
        // --> dto에 2개로 만든 생성자를 만들거나, 빈자리에 0 / null 을 적는다.
        // 3. 객체화된 dto를 dao에게 전달후 결과를 받는다.
        boolean result = waitingDao.waitingWrite( waitingDto );
        // 4. 결과를 view에게 리턴한다.
        return result;
    }

    // (2) 전체조회 기능 구현
    public ArrayList<WaitingDto> waitingPrint() {
        // - 유효성검사 ~ // - 매개변수~
        // 3. dao에게 요청후 결과받기
        ArrayList<WaitingDto> result = waitingDao.waitingPrint();
        // 4. 결과를 view에게 리턴한다.
        return result;
    }

    // (3) 취소/삭제 기능 구현
    public boolean waitingDelete( int wno ) {
        // 1. 유효성검사  // 2. 객체화
        // 3. dao에게 삭제할 번호 전달후 결과를 받는다.
        boolean result = waitingDao.waitingDelete(wno);
        // 4. 결과를 view에게 리턴한다.
        return result;
    }
    // (4) 수정 기능 구현
    public boolean waitingUpdate( int wno , int wcount ) {
        // 1. 유효성 검사
        // 2. 객체화<선택, 속성이 2개 이상 이면서 하나의 dto 표현 가능하면 권장>
        WaitingDto waitingDto = new WaitingDto( wno , null , wcount );
        // 3. dao에게 삭제할 번호 전달후 결과를 받는다.
        boolean result = waitingDao.waitingUpdate( waitingDto);
        // 4. 결과를 view에게 리턴한다.
        return result;
    }


}// class e
