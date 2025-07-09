package day07;

public class ParkingLot {
    // 메소드/API 설계
    // 1. 함수명 :  calculateFee
    // 2. 매개변수 : 주차 시간(분)  , int time
    // 3. 반환값: 최종 주차 요금 , int money  ----->이걸로 ai에게 도움받아라. 결과말고 과정으로
    int calculateFee( int time ) {
        int money = 0;
        if( time <= 30 ) { //기본 요금: 최초 30분까지 1,000원
            money = 1000;
        }else {
            money = ( ( time -30 ) / 10 * 500 ) + 1000; }//추가 요금: 30분 초과 시, 매 10분마다 500원씩 추가
            money = money >= 20000 ? 20000 : money;// 일일 최대 요금: 20,000원
        return money;
    }

    // int parkingMinutes; // 주차 시간(분)을 매개변수
    //calculateFee 메소드
  /*  int money = 0;
    if( minutes <= 30 ) { //기본 요금: 최초 30분까지 1,000원
        money = 1000;
    }else {  //추가 요금: 30분 초과 시, 매 10분마다 500원씩 추가
        money = ( ( minutes -30 ) / 10 * 500 );
    }

    money = money >= 20000 ? 20000 : money;
    System.out.println( "최종 요금 :" + money +"원" );
    */
}
