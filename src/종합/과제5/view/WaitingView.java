package 종합.과제5.view;

import 종합.과제5.controller.WaitingController;
import 종합.과제5.model.dao.WaitingDao;
import 종합.과제5.model.dto.WaitingDto;

import java.util.Scanner;

// (역할) 게시물 관련 입출력 클래스
public class WaitingView {
    // 싱글톤 만들기
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance() {
        return instance;
    }
    private WaitingController waitingController = WaitingController.getInstance();
    private Scanner scan = new Scanner( System.in );

    public void index() {
        for ( ; ; ) {
            System.out.println("=========== 맛집 대기 시스템 ===========");//(2) 출력
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("==================================");
            System.out.println("선택 > ");
            int choose = scan.nextInt();
            if( choose == 1 ) { addWaiting(); }
            else if( choose == 2 ) { getWaitingList(); }
        }// for e
    }// func e
    public void addWaiting() {
        System.out.println("전화번호 : "); String phone = scan.next();
        System.out.println("인원수 : "); int count = scan.nextInt();
        boolean result = waitingController.addWaiting( phone , count );
        if( result ) { System.out.println("[안내] 대기 등록이 완료되었습니다."); }
        else{ System.out.println("[경고] 더 이상 대기 등록을 할 수 없습니다."); }
    } // func e

    public void getWaitingList() {
        System.out.println("============= 대기 현황 =============");
        WaitingDto[] result = waitingController.waitingPrint();
        for( int i = 0 ; i< result.length ; i++ ) {
            WaitingDto waitingDto = result[i];
            if( waitingDto != null ) {
                System.out.printf("%d 연락처 : %s - %d \n" , i + 1 ,waitingDto.getPhone(), waitingDto.getCount() );
                System.out.println("------------------------------------");
            }
        }

    }


} // class e
