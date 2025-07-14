package 종합.과제6.view;

import 종합.과제6.controller.WaitingController;
import 종합.과제6.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    // 1) 싱글톤
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){
        return instance;
    }
    // 2) controller 싱글톤 가져오기
    private WaitingController waitingController = WaitingController.getInstance();

    // * 모든 메소드에서 사용가능한 Scanner 입력객체
    private Scanner scan = new Scanner( System.in );

    // * 프로그램 최초 화면
    public void index() {
        for( ; ; ) {
            System.out.println("=========== 맛집 대기 시스템 ===========");//(2) 무한출력
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("=====================================");
            System.out.println("선택 > ");
            int choose = scan.nextInt();
            if( choose == 1 ) { addWaiting(); }
            else if( choose == 2 ) { getWaitingList(); }
        } // for e
    } // fund e

    //  3) 등록 입출력 구현
    public void addWaiting() {
        // 1. 안내와 입력받기
        System.out.println("전화번호 : ");
        String phone = scan.next();
        System.out.println("인원수 : ");
        int count = scan.nextInt();
        // 2. controller에게 입력받은 값 인수로 전달후 결과(리턴)받기
        boolean result = waitingController.addWaiting( phone , count );
        // 3. 결과/리턴 따른 출력문
        if( result == true ) { System.out.println("[안내] 대기 등록이 완료되었습니다." ); }
        else { System.out.println("[경고] 더 이상 대기 등록을 할 수 없습니다."); }
    }

    // 4) 전체 조회 입출력 구현
    public void getWaitingList() {
        System.out.println("============= 대기 현황 =============");
        // 1. controller에게 요청후 결과(리턴)받기 , view 메소드 먼저 작성시 controller 메소드가 없으므로 오류가 발생됨
        ArrayList < WaitingDto > result = waitingController.getWaitingList();
        // 2. 받은 결과물들을 반복문 출력
        for( int i = 0 ; i < result.size() ; i++ ) {
            WaitingDto waiting = result.get( i );
            System.out.println("전화번호 : " + waiting.getPhone() );
            System.out.println("인원수 : " + waiting.getCount() );
        }// for e
    }//func e


}// class e
