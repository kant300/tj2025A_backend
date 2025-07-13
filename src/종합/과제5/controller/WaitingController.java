package 종합.과제5.controller;

import 종합.과제5.model.dao.WaitingDao;
import 종합.과제5.model.dto.WaitingDto;

public class WaitingController {
    // (2)싱글톤 만들기
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance() {
        return instance;
    }
    //(3)각 싱글톤을 호출하고 저장하는 멤버변수 선언
    private WaitingDao waitingDao = WaitingDao.getInstance();

    // (9) 등록기능 addWaiting(){}
    public boolean addWaiting( String phone, int count ) {
        boolean result = false;  // 실패라는 가정하에
        WaitingDto waitingDto = new WaitingDto( phone , count );
        result = waitingDao.addWaiting( phone, count );
        return result;
    }

    public WaitingDto[] getWaitingList() {
        return waitingDao.getWaitingList();
    }



}//class e
