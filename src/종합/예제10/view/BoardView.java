package 종합.예제10.view;

import 종합.예제10.controller.BoardController;
import 종합.예제10.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {
    // (*)싱글톤
    private BoardView() { }
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance() {
        return instance;
    }
    // (*) 모든 메소드가 사용 가능하도록 메소드밖에 입력객체 생성
    private Scanner scan = new Scanner(System.in);

    // (*) BoardController 싱글톤 불러오기
    private BoardController boardController = BoardController.getInstance();

    // (*) 메인 화면
    public void index() {
        for (; ; ) {
            try {
                System.out.println("==================== 비회원게시판 =====================");
                System.out.println("1.등록  2.전체조회  3.삭제  4.수정   선택> ");
                int choose = scan.nextInt();
                if (choose == 1) { boardWrite();  }
                else if (choose == 2) { boardPrint(); }
                else if (choose == 3) { boardDelete(); }
                else if (choose == 4) { boardUpdate(); }
                else { System.out.println("[경고] 존재하지 않는 번호 입니다. "); }
            } catch ( InputMismatchException e ) {
                System.out.println("[경고] 입력타입이 일치하지 않습니다. <다시입력> ");
                scan = new Scanner( System.in ); // 입력에 따른 입력객체 초기화 : 잘못된 데이터 지우기
            } catch ( Exception e ) {
                System.out.println("[오류] 관리자에게 문의 < 010-3333-3333 >");
            }
        }// for e
    }

    // (1) 등록 화면 구현
    public void boardWrite() {
        // 1. 입력받기
        scan.nextLine();
        System.out.println(">내용 : ");
        String bcontent = scan.nextLine();  // nextLine(); 띄어쓰기 가능
        System.out.println(">작성자 : ");
        String bwriter = scan.next();   // next(); 띄어쓰기 불가능
        // 2. controller 전달하기 // 3. 전달후 (결과)리턴값 저장하기
        boolean result = boardController.boardWriter(bcontent, bwriter);
        // 4. 리턴값 에 따른 출력하기
        if (result) { System.out.println("[안내] 게시물 작성 성공 "); }
        else { System.out.println("[경고] 게시물 작성 실패 "); }
    }// func e

    // (2) 전체조회 화면 구현
    public void boardPrint() {
        // 1. controller에게 요청후 결과받기
        ArrayList<BoardDto> result = boardController.boardPrint();
        // 2. 결과에 따른 화면구현
        System.out.println("no \t 작성자 \t 내용");
        for(BoardDto dto : result ) { // 향상된 for문 , for( 항목타입 변수명 : 리스트명 ) { }
            System.out.printf("%s \t %s \t %s \n" ,
                    dto.getBno() , dto.getBwriter() , dto.getBcontent() );
        }
    }

    // (3) 삭제 화면 구현
    public void boardDelete(){
        // 1. 입력받기
        System.out.print("삭제할 게시물 번호 : "); int bno = scan.nextInt();
        // 2. controller 전달하기 // 3. 전달 후 (결과)리턴값 저장하기
        boolean result = boardController.boardDelete(bno);
        // 4. 리턴된 값에 따른 출력하기
        if(result){ System.out.println("[안내] 삭제 성공 ");}
        else { System.out.println("[경고] 없는 번호 이거나 실패 "); }
    }

    // (4) 수정 화면 구현
    public void boardUpdate() {
        // 1. 입력받기
        System.out.print("수정할 게시물 번호 : "); int bno = scan.nextInt();
                scan.nextLine();
        System.out.print("수정할 게시물 내용 : "); String bcontent = scan.nextLine();
        // 2. controller 전달하기 // 3. 전달후 (결과)리턴값 저장하기
        boolean result = boardController.boardUpdate( bno, bcontent );
        // 4. 리턴된 값에 따른 출력하기
        if( result ) { System.out.println("[안내] 수정 성공"); }
        else{ System.out.println("[경고] 수정 실패");}


    }

}//class e
