package 종합.예제3;

import java.util.Scanner;

public class BoardService3 {
    public static void main(String[] args) {

        // (5) 메모리설계
        // 객체활용 : 게시물100개 -> 변수2개(객체화) -> 변수1개

        // 1. 다양한 속성을 하나의 클래스로 설계하자. content와 writer를 하나의 객체로
        // 2. 설계한 클래스/타입으로 배열을 선언
        Board[] boards = new Board[100];    // 변수1개, 배열1개, 객체100개 저장공간
        // boards라는 변수에  Board객체 100개를 저장 가능한 배열자료1개 저장


        for (; ; ) {    // (1) 무한루프
            System.out.println("============= My Community ============="); //(2) 출력
            System.out.println(" 1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.println("선택 > ");
            Scanner scan = new Scanner(System.in);    //(3) 입력객체 생성
            int choose = scan.nextInt();
            if (choose == 1) {      // (4) '1'번 입력시
                System.out.println("내용 :");
                String content = scan.next(); //(6) 입력받은 값 저장
                System.out.println("작성자 :");
                String writer = scan.next();
                Board board = new Board();  // (6) 객체생성하여 입력받은 값 대입
                board.content = content;
                board.writer = writer;
                // (6) 배열내 빈공간을 찾아서 빈공간에 객체대입
                boolean check = false;  // true :  저장성공 , false : 저장실패
                for (int index = 0; index <= boards.length - 1; index++) {   // (6) 배열내 빈공간을 찾아서 빈공간에 객체 대입
                    if (boards[index] == null) {   // index번째 요소가 비어(null) 있으면
                        boards[index] = board; // 해당 index번째 요소의 생성한 객체를 대입한다.
                        check = true;   // 상태변경
                        break;  // 목표이뤘으니 반복문 종료
                    }   // if e
                }   // for e
                if (check) {
                    System.out.println("[안내] 글쓰기 성공");
                }   // (6) 안내
                else {
                    System.out.print("[경고] 게시물을 등록할 공간이 부족합니다.");
                }

            } else if (choose == 2) {    // (4) '2'번 입력시
                System.out.println("============= 게시물 목록 =============");
                // (7) 배열내 요소(Board객체) 가 비어있지 않으면 board 객체 출력하시오.
                for (int index = 0; index <= boards.length - 1; index++) {
                    Board board = boards[index];    // index번째 요소 값(객체) 호출
                    if (board != null) {  //index번째 요소가 비어 있지 않으면
                        System.out.println("작성자 :" + board.writer);
                        System.out.println("내용 :" + board.content);
                        System.out.println("------------------------------------");
                    }   // if e
                }   //for e
            }   //if e
        }   // for e
    }   // main e
} // class e
