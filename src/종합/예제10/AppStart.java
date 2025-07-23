package 종합.예제10;

import 종합.예제10.controller.BoardController;
import 종합.예제10.view.BoardView;

public class AppStart {
    public static void main(String[] args) {

//        // 20250723 테스트 ( 확인후 주석처리 )
//        boolean result = BoardController.getInstance().boardWriter("테스트내용" , "강사");
//        System.out.println( result );
        // * 메인화면 호출
        BoardView.getInstance().index();
    }//main e
}//class e
