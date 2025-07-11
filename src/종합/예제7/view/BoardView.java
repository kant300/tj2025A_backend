package 종합.예제7.view;

import day09.package1.B;
import 종합.예제7.controller.BoardController;

import java.util.Scanner;

// (역할) 게시물 관련 입출력 클래스
public class BoardView {
    // (*) 싱글톤 만들기 1~3단계
    private BoardView(){} // 1단계
    private static final BoardView view = new BoardView(); // 2단계
    public static BoardView getInstance() {//3단계
        return view;
    }
    // (*) 여러 메소드에서 사용할 입력 객체를 멤버변수로 선언
    private Scanner scan = new Scanner( System.in );

    // - Controller 객체 가져오기 : 멤버변수
    private BoardController boardController = BoardController.getInstance();


    // (1) 메인 view : 최초로 보이는 화면
    public void index() {
        for( ; ; ) {
        System.out.println("============= My Community =============");// (2) 출력
        System.out.println("  1.게시물쓰기 | 2.게시물출력");
        System.out.println("========================================");
        System.out.print("선택 > ");
        int choose = scan.nextInt();
        if( choose == 1 ) { boardWriter(); }
        else if( choose == 2 ) { boardPrint(); }
        } // for e
    }//func e

    // (2) 등록 view
    public void boardWriter() {
        System.out.println("내용 : ");
        String content = scan.next();
        System.out.println("작성자 : ");
        String writer = scan.next();
        boolean result = boardController.boardWrite( content , writer );
        // - 입력받은 값들을 controll에게 전달후 반환값 저장
        if( result ) { System.out.println("[안내] 글쓰기 성공"); }
        else{ System.out.println("[경고] 글쓰기 실패"); }
    } // fund e

    // (3) 조회 view
    public void boardPrint() {
        System.out.println("============= 게시물 목록 =============");
        System.out.println("작성자 : ");
        System.out.println("내용 : ");
        System.out.println("------------------------------------");
    } //func e
}//class e
