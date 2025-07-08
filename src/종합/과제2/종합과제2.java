
package 종합.과제2;

import java.util.Scanner;

public class 종합과제2 {
    public static void main(String[] args) {

        // (5) 메모리 설계
        Waiting[] waitings = new Waiting[100];
        // Waitings이라는 변수에 Waiting객체 100개를 저장 가능한 배열자료1개 저장

        for( ; ; ) {    //(1) 무한루프
            System.out.println("=========== 맛집 대기 시스템 ===========");    // (2) 출력
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("==================================");
            System.out.println("======");
            System.out.println("선택 >");
            Scanner scan = new Scanner( System.in );    //(3) 입력객체 생성
            int choose = scan.nextInt();
            if ( choose == 1 ) {    // (4) '1번' 입력시
                System.out.println(" 전화번호 : ");
                String phone = scan.next(); // (6) 입력받은 값 저장
                System.out.println(" 인원수 : ");
                int count = scan.nextInt();
                //scan.nextLine();
                Waiting waiting = new Waiting();  // (6) Waiting객체 생성하여 입력받은 값 대입
                waiting.phone = phone;
                waiting.count = count;
                // (6) 배열내 빈공간을 찾아서 빈공간에 객체대입
                boolean check = false; // true : 저장성공 , false : 저장실패
                for( int index = 0 ; index <= waitings.length - 1 ; index++ ) {// (6) 배열내 빈공간을 찾아서 빈공간에 객체 대입
                    if ( waitings[index] == null ) {    // index번째 요소가 비어(null) 있으면
                        waitings[index] = waiting; // 해당 index번째 요소의 생성한 객체를 대입한다.^
                        check = true ;
                        break;
                    }
                }   //for e
                if ( check ) {
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                }   // (6) 안내
                else { System.out.println("[경고] 더 이상 대기 등록을 할 수 없습니다."); }

            }else if( choose == 2 ) {    // (4) '2'번 입력시
                System.out.println("============= 대기 현황 =============");
                // (7) 배열내 요소(Waiting객체) 가 비어있지 않으면 Waiting 객체 출력하시오
                for( int index = 0; index <= waitings.length - 1 ; index++ ) {
                    Waiting waiting = waitings[index];  // index번째 요소 값(객체) 호출
                    if ( waiting != null ) { //index번째 요소가 비어 있지 않으면
                        System.out.println(" 연락처 :" + waiting.phone + " - 인원 :" + waiting.count);
                        System.out.println("------------------------------------");
                    }   // if e

                }// for e
            } //if e


        }   //for e
    }   //main e
}   //class e
