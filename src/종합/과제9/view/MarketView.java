package 종합.과제9.view;

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
    // (*) 메인화면
    public void index() {
        for (; ; ) {
            try {
                System.out.println("======== (뚝딱마켓) 중고 거래 게시판 ==========");
                System.out.println("1.물품등록 | 2.물품현황 | 3.물품수정 | 4.물품삭제");
                System.out.println("==========================================");
                System.out.println("선택 >");
                int choose = scan.nextInt();
                if (choose == 1) {
                } else if (choose == 2) {
                } else if (choose == 3) {
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
        }
    }
}//class e
