package 종합.예제4;

// BoardController :  로직/제어 담당
public class BoardController {
    // 1. 멤버변수
    Board[] boards = new Board[100];
    // 2. 메소드
    // 2-1 등록 메소드
    boolean doPost( String content, String writer ) {
        // - Bored 객체를 생성하고,
        Board board = new Board();  // -객체생성
        board.content = content; // 매개변수로 받은 값들을 객체의 멤버 변수에 저장
        board.writer = writer;
        // boards 배열의 빈 공간(null)을 찾아 생성된 객체를 저장합니다.
        for (int index = 0; index <= boards.length - 1; index++) {
            if (boards[index] == null) { //
                boards[index] = board; //
                return true; // 저장 성공시 true
            }
        }   // for e
        return false;  // 실패(공간 없음)시 false를 반환(return)
    } // func e
    //

    // 2-2 조회 메소드
    Board[] doGet() { // Board 배열이라는 타입
        return boards;
    } // func e
}
