package 종합.과제6.model.dao;

import 종합.과제6.model.dto.WaitingDto;
import 종합.과제6.view.WaitingView;

import java.util.ArrayList;

public class WaitingDao {
    // 1) 싱글톤
    private WaitingDao(){}
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }
    // 2) 여러개 게시물(DTO)들을 저장할 리스트 선언
    private ArrayList< WaitingDto > waitingDB = new ArrayList<>();

    // 3) 게시물등록 addWaiting()
    public boolean addWaiting( String phone, int count ) {
        boolean result = false;
        // ~~~기능구현
        // 3-1)매개변수 값들을 객체화히기
        WaitingDto waitingDto = new WaitingDto( phone , count );
        // 3-2)리스트(DB)에 생성한 객체 대입하기
        waitingDB.add(waitingDto);
        // 3-3)성공시 result 에 성공의 의미 'true' 대입
        result = true;  // vs return true;
        return result;
    }
    // 4) 전체조회 기능 구현
    public ArrayList< WaitingDto > getWaitingList() {
        return waitingDB;
    }



}// class e
