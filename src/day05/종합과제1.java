package day05;

// step1 : 반복적인 메인(화면)출력
// step2 : 입력선택에 따른 화면 출력
// step3 : 기능별 필요한 메모리 설계
// step4 : 각 기능별 세부 코드 구현

import java.util.Scanner;

public class 종합과제1 {    // class s
    public static void main(String[] args) {    //main s

        // (5) for 밖에 선언 : 메모리설계
        String phone1 = null; String phone2 = null; String phone3 = null;
        String count1 = null; String count2 = null; String count3 = null;

        for( ; ; ) { // (1) 무한루프 시작 // for s
            // (2) 출력
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("==================================");
            System.out.println("======");
            System.out.println("선택 > ");  //  무한루프로 출력
            // (3) 입력
            Scanner scan = new Scanner(System.in);
            int choose = scan.nextInt();
            // (4) 입력에 따른 화면제어
            if (choose == 1) {
                //(5) 기능별 세부 코드 구현
                System.out.println("전화번호 : ");
                String phone = scan.next();
                System.out.println("인원수 : ");
                String count = scan.next();
                if (phone1 == null) {   // 대기 공간1 이 비어있는지
                    phone1 = phone;
                    count1 = count;    // 입력받은 값을 대입
                    System.out.println("[안내] 대기 등록이 완료되었습니다");
                } else if (phone2 == null) {  // 대기 공간2가 비어있는지
                    phone2 = phone;
                    count2 = count;
                    System.out.println("[안내] 대기 등록이 완료되었습니다");
                } else if (phone3 == null) {  // 대기 공간3이 비어있는지
                    phone3 = phone;
                    count3 = count;
                    System.out.println("[안내] 대기 등록이 완료되었습니다");
                } else {  // 그외, 비어있는 대기공간 못찾음
                    System.out.println("[경고] 더 이상 대기 등록을 할 수 없습니다.");
                }
            } else if (choose == 2) {
                System.out.println("============= 대기 현황 =============");
                // (6-1) 기능별 세부 코드 구현
                if (phone1 != null) { // 대기공간1 이 비어있지 않으면
                    System.out.println("전화번호 : " + phone1);
                    System.out.println("인원수 : " + count1);
                    System.out.println("------------------------------------");
                }
                if (phone2 != null) {  // 대기공간2 이 비어있지 않으면
                    System.out.println("전화번호 : " + phone2);
                    System.out.println("인원수 : " + count2);
                    System.out.println("------------------------------------");
                }
                if (phone3 != null) {  // 대기공간3 이 비어있지 않으면
                    System.out.println("전화번호 : " + phone3);
                    System.out.println("인원수 : " + count3);
                    System.out.println("------------------------------------");
                }
            }

        }   //무한루프 끝 for e
    }   // main e
}   // class e

