package 종합.예제4;

// step1 : 반복적인 메인(화면)출력
// step2 : 입력선택에 따른 화면 출력
// step3 : 기능별 필요한 메모리 설계
// step4 : 각 기능별 세부 코드 구현


import java.util.Scanner;

public class BoardService4 {
    public static void main(String[] args) {

        // (5) 메모리 설계
        // 1. content와 writer 멤버변수를 갖는 객체 필요하므로 Board 클래스 선언
        // 2. board 클래스 객체를 100개 저장하는 배열을 controller 선언 * 추후 : 데이터베이스(외부저장소) 활용
        // 3. doPost() 와 doGet() 메소드를 호출하기 위한 객체 생성

        BoardController bs = new BoardController();

        for( ; ; ) {    //(1) 무한루프 : 프로그램 계속적으로 실행하기 위해서
            System.out.println("============= My Community ============="); //(2) 출력
            System.out.println(" 1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.println("선택 > ");
            Scanner scan = new Scanner( System.in ); // (3) 입력
            int choose = scan.nextInt();
            if ( choose == 1 ) {    // (4) 입력에 따른 화면 출력
                System.out.println("내용 :");
                String content = scan.next();
                System.out.println("작성자 :");
                String writer = scan.next();
                // (6) * doPost 메소드를 호출해서 등록 처리후 결과를 받는다.
                boolean result = // doPost 메소드가 실행후 결과를 rusult에 저장
                        bs.doPost(content, writer); // 입력받은 두 값을 인수로 전달
                if (result == true) { // doPost에서 true 반환이면
                    System.out.println("[안내] 글쓰기 성공");
                } else {  // doPost에서 false 반환이면
                    System.out.println("[경고] 글쓰기 실패");
                }
            } else if ( choose == 2 ) {
                System.out.println("============= 게시물 목록 =============");
                Board[] boards = bs.doGet();
                //doGet() 반환된 boards배열 자료를 boards에 대입한다.
                for( int index = 0 ; index <= boards.length -1 ; index++ ) {
                    Board board = boards[index];
                    if( board != null ) {
                        System.out.println("작성자 :" + board.writer );
                        System.out.println("내용 :" + board.content );
                        System.out.println("------------------------------------");
                    }
                } //for e
            } // if e
        } // for e

    } // main e

}   //class e
