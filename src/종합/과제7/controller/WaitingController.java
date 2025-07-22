package 종합.과제7.controller;

import 종합.과제7.model.dao.WaitingDao;
import 종합.과제7.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    // (*) 싱글톤
    private WaitingController() {
    }

    private static final WaitingController instance = new WaitingController();

    public static WaitingController getInstance() {
        return instance;
    }

    // (*) Controller는 Dao만 호출 할 수있다. dao 싱글톤 호출
    private WaitingDao waitingDao = WaitingDao.getInstance();

    // (1) 등록
    public boolean waitingWrite(String phone, int count) {
        WaitingDto waitingDto = new WaitingDto(phone, count); // 1. 매개변수를 dto 객체생성
        boolean result = waitingDao.waitingWrite(waitingDto);// 2. dao 에게 저장할 객체를 전달하여 결과 받기
        return result;// 3. 결과를 view에게 리턴한다.
    }

    // (2) 전체조회
    public ArrayList<WaitingDto> waitingPrint() {
        ArrayList<WaitingDto> result = waitingDao.waitingPrint();// 1. dao에게 매개변수없이 모든 dto 정보를 요청하여 받는다.
        return result;// 2. 결과를 view에게 리턴한다.
    }

}// class e
