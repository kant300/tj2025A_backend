package day09;

public class TicketMachine {
// 1. 멤버변수/정적 변수
    static int totalTickets = 0; //(1).발권된 총 티켓 수를 저장변수를 선언
// 2. 생성자
// 3. 메소드
    //3-1. (2).티켓을 한 장 발권하는 issueTicket() 메소드
    void issueTicket() { // return 없으므로 void
    totalTickets++; //totalTickets를 1씩 증가
    System.out.println( "티켓 1장을 발권했습니다." );
    } // fund e

    // 3-2. (3).정적 메소드
    static void printTotalTickets() {
        System.out.println( totalTickets );
    } //func e
} //class e
