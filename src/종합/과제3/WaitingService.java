package 종합.과제3;

// step1 : 반복적인 메인(화면)출력
// step2 : 입력선택에 따른 화면 출력
// step3 : 기능별 필요한 메모리 설계
// step4 : 각 기능별 세부 코드 구현

import java.util.Scanner;

public class WaitingService {
    public static void main(String[] args) {

        // (5) 메모리설계
        // WaitingController 객체를 하나 생성
        WaitingController controller = new WaitingController();

        for( ; ; ) { // (1) 무한루프
            System.out.println("=========== 맛집 대기 시스템 ===========");//(2) 출력
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("==================================");
            System.out.println("======");
            System.out.println("선택 > ");
            Scanner scan = new Scanner( System.in ); //Scanner로 입력
            int choose = scan.nextInt();
            if( choose == 1 ) { // 기능 1: 대기 등록 (입력값: 1)
                System.out.println("전화번호 : ");
                String phone = scan.next();
                System.out.println("인원수 : ");
                int count = scan.nextInt();
                // (6) addWaiting() 메소드를 호출하면서, 입력받은 값들을 인자로 전달
                boolean result = // addWaiting 메소드가 실행후 결과를 rusult에 저장
                        controller.addWaiting( phone , count ); // 입력받은 두 값을 인수로 전달
                if( result == true ) { // addWaiting에서 true 반환이면
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                }else{  // addWaiting에서 false 반환이면
                    System.out.println("[경고] 더 이상 대기 등록을 할 수 없습니다.");
                }
            }else if(choose == 2) {
                System.out.println("============= 대기 현황 =============");
                Waiting[] waitings = controller.getWaitingList();
                //WaitingController 객체의 getWaitingList() 메소드를 호출하여 Waiting 배열을 반환받습니다.
                for( int index = 0 ; index <= waitings.length - 1 ; index++ ) {
                    Waiting waiting = waitings[index];
                    if( waiting != null) {
                        System.out.println("전화번호 : " + waiting.phone );
                        System.out.println("인원수 : " + waiting.count );
                        System.out.println("------------------------------------");
                    }
                } //for e
            }





        } // for e
    } // main e
} //class e
