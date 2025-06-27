package day01; // 현재 .java 파일 위치한 폴더명

import java.sql.SQLOutput;

public  class Example2 {    // class start : 모든 자바코드는 클래스안에 작성한다.
    // (1) main 함수 선언 : main + 엔터( 자동완성 )
    public static void main(String[] args) {    // main start
        //(2) 리터럴 : ( 자바 )언어 들이 미리 정의한 데이터
        // 3 , '김' , "김현수" , 3.14 , true    *JS에서는 ' 작은따옴표와 " 큰따옴표 구분이 없다.
        // 리터럴의 모든 정수는 int , 모든 실수는 double
        // (3) 출력함수 : System.out.print( 리터럴/변수/연산/ 함수 등 )

        // JS : console.log( ) * JS에서는 ;(세미콜론) 선택이지만, 자바는 무조건 명령어 끝에 ; 필수
        // sout + 엔터 ( 자동완성 )
        // (4) main 함수 실행 :  ctrl +shift+f10 또는 실행버튼
        System.out.println( 3 );
        System.out.println( 3.14 );
        System.out.println( '김' );
        System.out.println( "김현수" );
        System.out.println( true );
        // (5) 자료형/타입  , 8가지        *기본자료형 vs  참조자료형(내가 만든것)
        // 정수 : byte , short , int( * ) , long
        // 실수 : float , double( * )
        // 문자 : char                String (문자열)    , 문자와 문자열은 다르다.
        // 논리 : boolean

        // (6) 리터럴 값을 변수 ( * 하나의 자료를 저장 * ) 에 대입하기
        // 자료형 변수명 = 리터럴;
        // 1. boolean 타입 : true와 false 만 정장
        boolean bool1 = true;
        boolean bool2 = false;
        // boolean bool3 = 3;  // 3이라는 리터럴은 boolean 에 저장 불가능
        System.out.println( bool1 );
        System.out.println( bool2 );
        // 2. char 타입 : ' 작은따옴표로 감싼 문자1개 저장
        char ch1 = 'A';
        System.out.println( ch1 );
        // 3. String 클래스타입 : " 큰따옴표로 감싼 문자 여러개 저장
        String str1 = "ABC";
        // String str2 = 'ABC';  '   " 감싼 자료는 불가능
        System.out.println( str1 );

        // 4. byte 타입 : 정수 - 128                1바이트
        byte b1 = 100;
//byte b2 = 300;  // 불가능  : 저장허용범위 벗어남
        // 5. short 타입 : 정수 +- 3만정도      2바이트
        short s1 = 32000;
//short s2 = 50000;   //  불가능     : 저장허용범위 벗어남
        // 6. int 타입 : 정수 +- 21억정도        4바이트, 정수 리터럴*
        int i1 = 2100000000;
//int i2 = 3000000000;   //  불가능     : 저장허용범위 벗어남
        // 7. long 타입 : 정수 +-21억정도 이상   8바이트, 리터럴뒤에 L/l
// long l1 =  3000000000;      불가능     :  뒤에 L  , 키보드로 입력한 모든값은 (리터럴 ) 정수가 int 라서
        long l1 =  3000000000L;
        System.out.println( l1 );
        // 8. double 타입 : 실수 소수점 17자리 까지 표현, 실수 리터럴*
        double d1 = 0.123456789123456789;
        System.out.println( d1 );
        // 9. float 타입 : 실수 소수점 8자리까지 표현, 리터럴 뒤에 F/f
        float f1 =  0.123456789123456789F;
        System.out.println( f1 );
// ***********주의할점 : double( 기본타입) 과 Double(참조타입) 서로 ***********

    }   //main end

}   // class end

