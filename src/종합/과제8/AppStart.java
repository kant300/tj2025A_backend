package 종합.과제8;

import 종합.과제8.controller.WaitingController;
import 종합.과제8.model.dao.WaitingDao;
import 종합.과제8.view.WaitingView;

public class AppStart {
    public static void main(String[] args) {


//    // 등록 테스트 ( 확인후 주석처리 )
//    boolean result = WaitingController.getInstance().WaitingWrite("010-2326-5768" , 3);
//    System.out.println( result );

        // * 메인화면호출
        WaitingView.getInstance().index();
    }





}// class e
