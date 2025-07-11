package 종합.과제5.controller;

import 종합.과제5.model.dao.WaitingDao;
import 종합.과제5.model.dto.WaitingDto;

public class WaitingController {
    // 싱글톤 만들기
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance() {
        return instance;
    }
    private WaitingDao waitingDao = WaitingDao.getInstance();

    public boolean addWaiting( String phone, int count ) {
        WaitingDto waitingDto = new WaitingDto( phone , count );
        boolean result = waitingDao.addWaiting( phone, count );
        return result;
    }

    public WaitingDto[] waitingPrint() {
        WaitingDto[] result = waitingDao.waitingPrint();
        return result;
    }



}//class e
