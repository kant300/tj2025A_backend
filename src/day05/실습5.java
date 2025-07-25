/*
JAVA] 실습5 : 반복문
[ 문제 ] 아래 반복문 관련 문제
[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.

[문제 1] for문을 사용하여 1부터 10까지의 숫자를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

[문제 2] for문을 사용하여 10부터 1까지의 숫자를 역순으로 출력하는 프로그램을 작성하시오.

[문제 3] for문을 사용하여 1부터 50까지 모든 정수의 합계를 구하여 최종 결과를 출력하시오.
출력 예시:
1부터 50까지의 합계: 1275

[문제 4] for문과 if문을 사용하여, 1부터 20까지의 숫자 중 짝수만 출력하는 프로그램을 작성하시오.

[문제 5] 1부터 30까지의 숫자 중, 3의 배수는 건너뛰고 나머지 숫자만 출력하는 프로그램을 작성하시오.
요구 조건: continue 문을 반드시 사용하시오.

[문제 6] 1부터 순서대로 숫자를 더해나갈 때, 합계가 처음으로 100을 초과하는 시점의 숫자와 그때까지의 합계를 출력하고 반복문을 즉시 종료하시오.
요구 조건: break 문을 반드시 사용하시오.
출력 예시:
14까지 더했을 때 합계가 105로 100을 넘습니다.

[문제 7] 중첩 for문을 사용하여 아래와 같이 별(*)로 이루어진 직각삼각형을 출력하시오.
출력 예시:
*
**
***
****
*****

[문제 8] 중첩 for문을 사용하여 아래와 같이 별(*)로 이루어진 역직각삼각형을 출력하시오.
출력 예시:
*****
****
***
**
*


[문제 9]  Scanner와 무한루프를 사용하여, 사용자가 "end"를 입력할 때까지 계속해서 문자열을 입력받는 프로그램을 작성하시오. "end"가 입력되면,
그 전까지 입력된 문자열의 총 횟수를 계산하여 아래 출력 예시와 같이 출력한 뒤 프로그램을 종료하시오.
요구 조건:
무한루프를 사용하시오 (for(;;) 또는 while(true)).
입력 횟수를 저장할 count 변수를 사용하시오.
break를 사용하여 루프를 탈출하시오.
문자열 비교는 .equals() 메소드를 사용하시오.
실행 예시:
1회 입력 : 자바
2회 입력 : 자바스크립트
3회 입력 : 파이썬
4회 입력 : HTML
5회 입력 : CSS
6회 입력 : C언어
7회 입력 : end
[안내] 프로그램을 종료 합니다.[총 6회 입력]

[문제 10] 아래 선언된 4개의 변수는 7월 각 주차별 매출액입니다. 각 매출액을 '만원' 단위로 변환하고, 백만원 단위마다 '■' 문자로 시각화하여 아래 출력 예시와 같이 보고서를 출력하시오.
선언 코드:
int july1 = 3532100;
int july2 = 9123700;
int july3 = 5183400;
int july4 = 11738700;
요구 조건:
매출액을 10000으로 나눈 몫을 사용하여 '만원' 단위를 계산합니다.
'만원' 단위 값을 다시 100으로 나눈 몫만큼 for문을 사용하여 '■' 문자를 반복 출력합니다.
출력 예시:
------- 7월 매출액 -------
1주차 : ■■■353만원
2주차 : ■■■■■■■■■912만원
3주차 : ■■■■■518만원
4주차 : ■■■■■■■■■■■1173만원


[문제 11]  Scanner와 for(;;) 무한루프를 사용하여 간단한 ATM 기기를 만드시오.
요구 조건:
사용자에게 "1:입금 | 2:출금 | 3:잔고 | 4:종료" 메뉴를 보여줍니다.
Scanner로 메뉴 번호를 입력받습니다.
1번을 선택하면 "입금액:"을 물어보고, 입력받은 금액만큼 잔고(balance)를 증가시킵니다.
2번을 선택하면 "출금액:"을 물어보고, 입력받은 금액만큼 잔고를 감소시킵니다. (단, 잔고보다 큰 금액은 출금할 수 없다고 안내)
3번을 선택하면 현재 잔고를 출력합니다.
4번을 선택하면 "프로그램을 종료합니다." 메시지를 출력하고 break를 이용해 무한루프를 탈출합니다.
초기 잔고는 0으로 시작합니다.
실행 예시:
---------------------------------
1:입금 | 2:출금 | 3:잔고 | 4:종료
---------------------------------
선택> 1
입금액> 10000
---------------------------------
1:입금 | 2:출금 | 3:잔고 | 4:종료
---------------------------------
선택> 3
잔고> 10000
---------------------------------
1:입금 | 2:출금 | 3:잔고 | 4:종료
---------------------------------
선택> 4
프로그램을 종료합니다.
 */
package day05;


import java.util.Scanner;

public class 실습5 { //class s  : 컴파일

    public static void main(String[] args) { //main s : 실행
        /*
        // [1] for  초기값 1부터 : 조건문 10까지 : 증감식 1씩 증가 : 실행문 출력 :
        for ( int i = 1 ; i<= 10 ; i++ ){ System.out.println( i ); }

        // [2] 초기갑 10부터 ; 조건문 1까지 ; 증감식 1씩 감소 ; 실행문 출력
        for ( int i = 10 ; i >= 1 ; i-- ){ System.out.println( i );}



        // [3] 초기값 1부터 ; 조건문 50까지 ; 증감식 1씩 증가 ; 실행문 누적합계 += 출력
        int sum = 0; // 누적합계 변수 초기값
            for( int i = 1 ; i <= 50 ; i++ ){
                sum = sum + i ; // 또는 sum += i
            }
            System.out.println( sum ); // for 종료되고 최종적인 합계 출력 한다.

        // [4] 초기값 1부터 ; 조건문 20까지 ; 증감식 1씩증가 ; 실행문 짝수만 출력
        for( int i = 1 ; i <= 20 ; i++ ){
            if( i % 2 == 0 ){  //반복변수 나누기 2했을 때 나머지가 0이면
                System.out.println( i );}
        }

        // [5] 초기값 1부터 , 조건문 30까지 , 증감식 1씩 증가 , 실행문 3배수 제외한 숫자출력
        for( int i = 1 ; i <=30 ; i++) {
            if( i % 3 == 0 ){ //배수찾기 : 값 % 배수 == 0
                continue; // 가장 가까운 반복문(증감식)으로 이동
            } // if end
            System.out.println( i );
        } // for end



        // [6] 초기값 1부터, 조건문 100까지 , 증감식 1씩 증가 , 실행문 누적합계 , 100초과하는 시점
        int sum2 = 0;
        for( int i = 1 ; i <=100 ; i++ ) {
            sum2 += i ; // 변수 += 값
            if( sum2 > 100 ){   // 누적합계가 100초과하는 시점
                System.out.println( i );  // 14
                System.out.println( sum2 ); // 105
                break;  // 가장 가까운 반복문{} 탈출/종료
            }   // if e
        }   // for e


        // [7] [초기값] : , [조건문] : , [증감식] : , [실행문] :
                        줄       별
        *               1        1
        **              2        1 2
        ***             3        1 2 3
        ****            4        1 2 3 4
        *****           5        1 2 3 4 5
        줄   초기값 1부터 , 조건문 5까지 , 증감식 1씩 증가, 실행문 줄바꿈
        별   초기값 1부터 , 조건문 현재 줄까지, 증감식 1씩 증가, 실행문 * 출력
*/
        for( int 줄 = 1; 줄 <=5 ; 줄++ ){
            for( int 별 = 1 ; 별 <=줄 ; 별++ ){
                System.out.print( " * " );    //줄바꿈 처리없는 print 함수 * 출력
            }   // for e
            System.out.println();   // 줄바꿈 처리
        }   // for e

        // [8]
        /*          줄       별               별조건식
        *****       1       1 2 3 4 5        5, 전체줄수-현재줄수 =  4+1
        ****        2       1 2 3 4          4,                    3+1
        ***         3       1 2 3            3,                    2+1
        **          4       1 2              2,                    1+1
        *           5       1                1,                    0+1
        줄   초기값 1부터 , 조건문 5까지   ,   증감식 1씩 증가, 실행문 줄바꿈
        별   초기값 1부터 , 조건문 전체줄수-현재줄수+1 까지 , 증감식 1씩 증가, 실행문 * 출력
        */
        int 전체줄수 = 5;
        for( int 줄 = 1 ; 줄 <= 전체줄수 ; 줄++ ){
            for( int 별 = 1 ; 별 <= 전체줄수 - 줄 + 1 ; 별++ ){
                System.out.print(" * ");
            }// for e
            System.out.println();   //줄바꿈처리
        }   //for e


        // [9] 무한루프는 초기값 생략, 조건문 생략, 증감식 생략, 실행문 입력, 출력, "end"이면 break
            int count = 0;  // 반복문 밖에서 반복(입력) 횟수 변수를 선언하고
            for( ; ; ) { //무한루프  , for( count = 1 ; true ; count++ )
                Scanner scan = new Scanner(System.in); // (1) 압력객체 생성하여 변수에 저장한다.
                String str = scan.next(); //(2) 문자열 입력받아 문자열 변수에 저장한다.
                System.out.println(str);    // (3) 입력받은 값 출력
                if (str.equals("end")) {   // (4) 자바에서 문자열 비교는.equals() 함수 사용
                    System.out.printf("프로그램 종료합니다.[총 %d회 입력] \n" , count);  //(7)
                    break;  // 가장 가까운 반복문 종료 : 무한루프 종료
                }
                // (6) 입력 횟수 == 반복 횟수 저장하는 변수
                // int count = 0; // 반복문 안에서 변수 선언시 선언이 계속 반복된다.
                count++;    // count +=1    , count = count + 1
            }   //for end

        // [10] 초기값 1부터 , 조건문 100나눈값까지 , 증감식 1씩증가, 실행문 ㅁ+한자키 ■ 출력
        int july1 = 3532100; int july1만원 = july1 / 10000;   // int / int -> int(몫)
        int july2 = 9123700; int july2만원 = july2 / 10000;   // int / int -> int(몫)
        int july3 = 5183400; int july3만원 = july3 / 10000;   // int / int -> int(몫)
        int july4 = 11738700; int july4만원 = july4 / 10000;   // int / int -> int(몫)

        for ( int i = 1 ; i <= july1만원/100 ; i++ ){ System.out.print("■"); }
        System.out.println( july1만원 + "만원" );

        for ( int i = 1 ; i <= july2만원/100 ; i++ ){ System.out.print("■"); }
        System.out.println( july2만원 + "만원" );

        for ( int i = 1 ; i <= july3만원/100 ; i++ ){ System.out.print("■"); }
        System.out.println( july3만원 + "만원" );

        for ( int i = 1 ; i <= july4만원/100 ; i++ ){ System.out.print("■"); }
        System.out.println( july4만원 + "만원" );

        // [11]
        // step1. 시각적인 요소1
//        for( ; ; ){ // (1) 무한루프 , 특정한 break를 만나기 전까지 계속 반복실행
//            // (2) 출력
//            System.out.println("---------------------------------");
//            System.out.println("1:입금 | 2:출금 | 3:잔고 | 4:종료");
//            System.out.println("---------------------------------");
//            // (3)
//            System.out.println("선택> ");
//            Scanner scan = new Scanner( System.in );    // 3-1 : 입력객체 생성하여 변수에 저장
//            int choose =scan.nextInt(); // 3-2 : 입력받은 정수를 변수에 저장
//        }   // for e
        // step2. 시각적인 요소2 ( 선택 번호의 경우에 따른 화면 출력 )
//          for( ; ; ){
//            System.out.println("---------------------------------");
//            System.out.println("1:입금 | 2:출금 | 3:잔고 | 4:종료");
//            System.out.println("---------------------------------");
//            System.out.println("선택> ");
//            Scanner scan = new Scanner( System.in );    // 3-1 : 입력객체 생성하여 변수에 저장
//            int choose =scan.nextInt(); // 3-2 : 입력받은 정수를 변수에 저장
//            // (1) 선택판단
//            if ( choose == 1 ){
//                // (2) 각각의 출력/입력
//                System.out.print("입금액> "); int money = scan.nextInt(); }
//            if ( choose == 2 ) { // 만약에 '2번' 입력했으면
//                // (2) 각각의 출력/입력
//                System.out.print("출금액> "); int money = scan.nextInt(); }
//            if ( choose == 3 ) { // 만약에 '3번' 입력했으면
//                System.out.print("잔고> "); int money = scan.nextInt(); }
//            if ( choose == 4 ) { // 만약에 '4번' 입력했으면
//                System.out.print("프로그램을 종료합니다. "); int money = scan.nextInt(); }
//        }   // for e
        // step3. 기능 구현에 필요한 메모리 설계
        // balance변수 : (for밖에 - 누적o)초기잔고 0부터 해서 입금했을때 + , 출금했을때 -
        // money 입금액/출금액 변수 : (for 안에 - 누적x)

        // step4. 각 기능별 코드 구현
            // 입금 기능 : money 입력받아 balance 변수에 누적합계 ( + ) 한다.
            // 출금 기능 : money 입력받아 balance 보다 이상이면 차감 ( - ) 한다.
            // 잔고 기능 :
            // 종료 기능 : break; 무한루프 종료한다.
        int balance = 0; // (1) 메모리 : 잔고변수
        for( ; ; ){
            System.out.println("---------------------------------");
            System.out.println("1:입금 | 2:출금 | 3:잔고 | 4:종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");
            Scanner scan = new Scanner( System.in );
            int choose = scan.nextInt();
            if( choose == 1 ){              // (2) 기능 세부 코드 구현
                System.out.print("입금액> ");      int money = scan.nextInt();
                balance += money;
            }else if( choose == 2 ){        // (2) 기능 세부 코드 구현
                System.out.print("출금액> ");      int money = scan.nextInt();
                if( balance >= money ){ balance -= money;  }
                else{ System.out.println("[안내] 잔고가 부족합니다. ");  }
            }else if( choose == 3 ){        // (2) 기능 세부 코드 구현
                System.out.println("잔고> " + balance );
            } else if( choose == 4 ){       // (2) 기능 세부 코드 구현
                System.out.println("프로그램을 종료합니다.");
                break; // 무한루프 종료
            }
        } // for end












    } //main e
} //class e
