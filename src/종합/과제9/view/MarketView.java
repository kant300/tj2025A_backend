package 종합.과제9.view;

import 종합.과제9.controller.MarketController;
import 종합.과제9.model.dto.MarketDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MarketView {
    // (*)싱글톤
    private MarketView(){}
    private static final MarketView instance = new MarketView();
    public static MarketView getInstance(){
        return instance;
    }
    private Scanner scan = new Scanner( System.in );

    // (*) MarketController 싱글톤 호출 : 컨트롤러 메소드/기능 사용하기 위해
    private MarketController marketController = MarketController.getInstance();
    // (*) 메인화면
    public void index() {
        for (; ; ) {
            try {
                System.out.println("======== (뚝딱마켓) 중고 거래 게시판 ==========");
                System.out.println("1.물품등록 | 2.물품현황 | 3.물품수정 | 4.물품삭제");
                System.out.println("==========================================");
                System.out.println("선택 >");
                int choose = scan.nextInt();
                if (choose == 1) { marketWrite(); }
                else if (choose == 2) { marketPrint(); }
                else if (choose == 3) {
                } else if (choose == 4) {
                } else {
                    System.out.println("[경고] 존재하지 않는 번호입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("[경고]입력타입이 일치하지 않습니다.<다시입력>");
                scan = new Scanner(System.in);

            } catch (Exception e) {
                System.out.println("[오류] 관리자에게 문의 < 010-2326-5768 >");
            }
        } //for e
    }// func e

    // (1) 등록기능 구현
    public boolean marketWrite(){
        // 1. 입력받기
        scan.nextLine();
        System.out.println( "판매자 닉네임 : " ); String puser = scan.nextLine();
        System.out.println( "물품명 : " ); String pname = scan.nextLine();
        System.out.println( "설명 : " ); String pcontent = scan.nextLine();
        System.out.println( "가격 : " ); int pprice = scan.nextInt();
        System.out.println( "비밀번호 : " ); String ppwd = scan.nextLine();
        // 2. controller 전달하기 // 3. 전달후 (결과)리턴값 저장하기
        boolean result = marketController.marketWrite( puser , pname , pcontent , pprice , ppwd );
        if( result ) { System.out.println( "[안내] 물품등록이 완료되었습니다." ); }
        else { System.out.println( "[경고] 물품 등록 불가입니다." ); }
        return result;
    }

    // (2) 전체조회 화면 구현
    public void marketPrint() {
        // 1. controller에게 요청후 결과받기
        ArrayList<MarketDto> result = marketController.marketPrint();
        // 2. 결과에 따른 화면구현
        System.out.println(" no \t 물품명\t 가격\t 닉네임\t 등록일\t 판매여부 ");
        for( marketDto dto : result ){ " %s \t %s \t %d \t %s \t %s \t %s \n " ,
                dto.getPno() , dto.getPname() , dto.getPrice() , dto.getPuser() , dto.getPdate() , dto.getPsale() );
        }
    }


}//class e
