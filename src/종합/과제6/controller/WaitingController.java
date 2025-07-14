package 종합.과제6.controller;

import 종합.과제6.model.dao.WaitingDao;
import 종합.과제6.model.dto.WaitingDto;
import 종합.과제6.view.WaitingView;

import java.util.ArrayList;

public class WaitingController {
    // 1) 싱글톤
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }
    // 2) dao 싱글톤 가져오기
    private WaitingDao waitingDao = WaitingDao.getInstance();

    // 3) 게시물등록 addWaiting()
    public boolean addWaiting( String phone, int count ) {
        boolean result = false;
        // ~~~기능구현
        // 3-1) dao에게 매개변수를 전달하고 결과(리턴)값을 받는다.
        result = waitingDao.addWaiting( phone, count);
        return result;
    }

    // 4) 전체조회 기능 구현
    public ArrayList <WaitingDto> getWaitingList() {
        // 1) dao에게 요청후 모든 게시물(dto)들을 반환받아 view 에게 반환한다.
        return waitingDao.getWaitingList();
    }


}// class e
