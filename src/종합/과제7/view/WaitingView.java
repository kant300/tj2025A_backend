package 종합.과제7.view;

import 종합.과제7.controller.WaitingController;
import 종합.과제7.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    // (*)싱글톤
    private WaitingView (){}
    private static final WaitingView  instance = new WaitingView ();
    public static WaitingView  getInstance(){
        return instance;
    }
    // (*) 입력객체 : 메소드 밖에 선언한이유 --> 여러개 메소드에서 사용하기 위해
    private Scanner scan = new Scanner( System.in );
    // (*) WaitingController 싱글톤 호출 : 컨트롤러 메소드/기능 사용하기 위해
    private WaitingController waitingController = WaitingController.getInstance();
    // (*) 메인 뷰
    public void index() {
        for( ; ; ) {
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("=====================================");
            System.out.println("선택 > ");
            int choose = scan.nextInt();
            if( choose == 1 ) { waitingWrite(); }
            else if( choose == 2 ) { waitingPrint(); }
        }
    }
    // (1) 등록 뷰
    public void waitingWrite( ) {
        // 1. 입력받기
        System.out.println("전화번호 : "); String phone = scan.next();
        System.out.println("인원수 : "); int count = scan.nextInt();
        // 2. controller 에게 입력받은 값 전달하고 결과받기
        boolean result = waitingController.waitingWrite( phone , count );
        if( result ) { System.out.println("[안내] 대기 등록이 완료되었습니다.");}
        else { System.out.println("[경고] 대기 등록이 불가입니다. "); }
    }

    // (2) 전체조회 뷰
    public void waitingPrint() {
        // 1. controller 요청후 결과받기
        ArrayList<WaitingDto> result = waitingController.waitingPrint();
        // 2. 결과를 반복하여 출력한다.
        for( WaitingDto dto : result ) {
            //System.out.println("연락처 : " + dto.getPhone() + "- 인원 : " + dto.getCount() + "명" );
            System.out.printf("연락처: %s - 인원: %d \n" , dto.getPhone() , dto.getCount());
            System.out.println("------------------------------------------------");
        }
    }

}// class e
