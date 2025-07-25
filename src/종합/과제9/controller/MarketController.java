package 종합.과제9.controller;

import 종합.과제9.model.dto.MarketDto;

import java.util.ArrayList;

public class MarketController {
    // (*)싱글톤
    private MarketController(){}
    private static final MarketController instance = new MarketController();
    public static MarketController getInstance(){
        return instance;
    }

    // (1) 등록기능 구현
    public boolean marketWrite( String puser , String pname , String pcontent , int pprice , String ppwd ){
        // 1. 유효성 검사( 패스 )
        // 2. 데이터문제 없으면 묶음(객체) 하나로 만들기
        // --> 주의할점 매개변수와 동일한 생성자가 존재하지 않으면 오류 발생한다.
        MarketDto marketDto = new MarketDto( 0 ,puser , pname , pcontent , pprice , ppwd );
        // 3. 객체화된 dto를 dao에게 전달후 결과를 받는다.
        boolean result = marketDto.marketWrite( marketDto );
        // 4. 결과를 view에게 리턴한다.
        return result;
    }

    // (2) 전체조회 기능 구현
    public ArrayList<MarketDto> marketPrint() {
        // - 유효성검사 ~ // - 매개변수~
        // 3. dao에게 요청후 결과받기
        ArrayList<MarketDto> result = marketDao.marketPrint();
        // 4. 결과를 view에게 리턴한다.
        return result;
    }

} //class e
