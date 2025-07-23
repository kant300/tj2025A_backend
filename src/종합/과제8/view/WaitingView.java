package 종합.과제8.view;

import 종합.과제8.controller.WaitingController;
import 종합.과제8.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WaitingView {
    // (*)싱글톤
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){
        return instance;
    }
    // (*) 입력객체 : 메소드 밖에 선언한이유 --> 여러개 메소드에서 사용하기 위해
    private Scanner scan = new Scanner( System.in );
    // (*) WaitingController 싱글톤 호출 : 컨트롤러 메소드/기능 사용하기 위해
    private WaitingController waitingController = WaitingController.getInstance();

    // (*) 메인 화면
    public void index() {
        for (; ; ) {
            try {
                System.out.println("================ 맛집 대기 시스템 ==================");
                System.out.println("1.대기 등록 | 2.대기 현황 | 3. 대기 취소 | 4. 대기 수정");
                System.out.println("================================================");
                System.out.println("선택 > ");
                int choose = scan.nextInt();
                if (choose == 1) { waitingWrite(); }
                else if (choose == 2) { waitingPrint(); }
                else if (choose == 3) { waitingDelete(); }
                else if (choose == 4) { waitingUpdate(); }
                else { System.out.println("[경고] 존재하지 않는 번호 입니다. "); }
            }catch ( InputMismatchException e ) {
                System.out.println("[경고] 입력타입이 일치하지 않습니다. <다시입력> ");
                scan = new Scanner(System.in);
            } catch ( Exception e ) { System.out.println("[오류] 관리자에게 문의 < 010-3333-3333 >"); }
        }// for e
    }
    // (1) 등록기능 구현
    public boolean waitingWrite( ) {
        // 1. 입력받기
        scan.nextLine();
        System.out.println("전화번호 : ");
        String wphone = scan.nextLine();
        System.out.println("인원수 : ");
        int wcount = scan.nextInt();
        // 2. controller 전달하기 // 3. 전달후 (결과)리턴값 저장하기
        boolean result = waitingController.waitingWrite(wphone, wcount);
        if (result) { System.out.println("[안내] 대기 등록이 완료되었습니다.");
        } else { System.out.println("[경고] 대기 등록이 불가입니다. "); }
        return result;
    }

    // (2) 전체조회 화면 구현
    public void waitingPrint() {
        // 1. controller에게 요청후 결과받기
        ArrayList<WaitingDto> result = waitingController.waitingPrint();
        // 2. 결과에 따른 화면구현
        System.out.println(" no \t 연락처 \t 인원수 ");
        for(WaitingDto dto : result ){ //향상된 for문, for( 항목타입 변수명 : 리스트명) { }
            System.out.printf(" %s \t %s \t %d \n " ,
                    dto.getWno() , dto.getWphone() , dto.getWcount() );
        }
    }

    // (3) 취소/삭제 기능 구현
    public void waitingDelete() {
        // 1. 입력받기
        System.out.println("취소할 대기 번호 :");
        int wno = scan.nextInt();
        // 2. controller 전달하기 // 3. 전달 후 (결과)리턴값 저장하기
        boolean result = waitingController.waitingDelete(wno);
        // 4. 리턴된 값에 따른 출력하기
        if (result) { System.out.println("[안내] 취소 성공 "); }
        else { System.out.println("[경고] 없는 번호 이거나 실패 "); }
    }

    // (4) 수정 기능 구현
    public void waitingUpdate() {
        // 1. 입력받기
        System.out.println("수정할 대기 번호 : "); int wno = scan.nextInt();
        System.out.println("수정할 대기 인원수 : "); int wcount = scan.nextInt();
        // 2. controller 전달하기 // 3. 전달 후 (결과)리턴값 저장하기
        boolean result = waitingController.waitingUpdate( wno ,wcount );
        // 4. 리턴된 값에 따른 출력하기
        if( result ) { System.out.println("[안내] 수정 성공"); }
        else{ System.out.println("[경고] 수정 실패");}
    }




}// class e
