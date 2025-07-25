package day20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class BookDto{

}
class BoardDto{

    @Override
    public String toString() {
        return "BoardDto{}";
    }
}

public class Example1 {
    public static void main(String[] args) {

        /*
        - 리터럴(상수) 값/
        - 타입 : 값 분류하는 종류
            1. 기본타입: 8가지 , 리터럴 , 소문자로 시작 , int , 객체지향 아니더라도 존재했었다
                -> 자바회사에서 제공하는 타입
                vs
            2. 참조타입 : 배열/클래스/인터페이스 , new(인스턴스)자료 , 대문자로시작 , Integer
                -> 개발자 만든 타입 또는 라이브러리
                MemberDto a = new MemberDto() <--(인스턴스)자료


        [ 클래스 ] : 기본타입에 존재하지 않은 새로운 타입 설계 , 라이브러리(도구) 미리 만들어진 클래스들
            예] int는 정수1개만 저장 타입이므로 , int int 정수 2개를 저장하는 타입
            class SuperInt{ int value; int value2; }
        [ 자바의 기본 클래스 ]
            1. Object 클래스 : 모든 객체의 조상 , 즉] 모든 인스턴스는 Object으로 상속받는다.
                특징 : 모든 자료를 저장/대입 받을 수 있다.
                주요 메소드
                    1) .toString()  : 자료(객체)의 주소값 반환 함수
                    2) .equals()    : 자료(객체)의 비교 결과를 반환 함수
                        == 주소비교
                    3) .hashCode()  : 자료(객체)를 정수로 반환 함수
            2. Class 클래스 : 클래스의 정보를 담는 클래스
                특징 : *리플랙션*( 실행중 객체 할당, 멤버분석 )
                주요메소드
                    1) Class.forName()      : 실행중 지정한 클래스 로드 함수
                    2) .getFields()         : 지정한 인스턴스의 모든 멤버변수 (정보)반환
                       .getConstructors()   : 지정한 인스턴스의 모든 생성자 (정보)반환
                       .getMethods()        : 지정한 인스턴스의 모든 메소드(정보) 반환

           3. Wrapper 클래스 : 8가지 기본타입을 참조타입 사용
                특징 : 기본타입은 메소드(기능)이 없어서 다양한 기능을 제공받는다.
                종류 : Byte Short Integer long,
                      Boolean Float Double
                주요메소드
                    .parseXXXX( "문자열" ) : 문자열 ---> XXXX 타입변환 메소드
                    String.valueOf( 자료); *자료 --> 문자열 변환

            4. LocalDate 클래스 : 시스템의 날짜/시간 정보 클래스
                특징 : 날짜/시간 정의/형식/세부/계산
                주요메소드
                    1. LocalDateTime.now() : 시스템의 현재 날짜/시간 LocalDateTime 객체 반환
                    2. LocalDateTime.of( 년 , 월 , 일, 시 , 분 , 초 )  : 지정한 값으로 날짜/시간을 갖는 LocalDateTime
                    3. .getYear()   : 객체내 연도 (int)반환
                    4. .getMonthValue() : 객체내 연도 (int)반환
                    5. .getDayOfMonth() : 객체내 월 (int)반환
                    6. .getHour()   : 객체내 시 (int)반환
                    7. .getMinute() : 객체내 분 (int)반환
                    8. getSecond()  : 객체내 초 (int)반환
                    9. .format( DateTimeFormatter객체 ); : 지정한 형식으로 날짜/시간 문자열로 반환
                    + DateTimeFormatter 날짜/시간 형식 변환 클래스
                    + DateTimeFormatter 변수명 = DateTimeFormatter.ofPattern();
                    + 패턴 : y연도 M월 d일 h시 m분 s초
                    10. .plusDays( 일수 ) : 객체내 일수를 더한 결과를 LocalDateTime 반환
                    11. .minusDays( 일수 ) : 객체내 일수를 뺀 결과를 LocalDateTime 반환





         */
        // [1] Object
        // 1) Object 타입은 모든 타입을 상속하므로 *다형성*으로
        Object o1 = 3;      // 정수를 Object로 분류할 수있다.
        Object o2 = 3.14;   // 실수를 Object로 분류할 수있다.
        Object o3 = true;   // 논리를 Object로 분류할 수있다.
        Object o4 = "유재석";  // 문자열을 Object로 분류할 수있다.
        Object o5 = new Object();
        Object o6 = new int[] { 1 , 2 , 3 };
        // 2) Object 타입/클래스의 주요 메소드
        Object o7 = new BookDto();
        Object o8 = new BoardDto();
            // 1. toString() : 인스턴스/자료 주소(메모리위치) 반환
            // -> 주로 오버라이딩(재정의) 해서 인스턴스의 정보(문자)반환
        System.out.println( o7.toString() ); // day20.BookDto@7ba4f24f
        System.out.println( o8.toString() ); // BoardDto{}
        System.out.println( o7 ); // day20.BookDto@7ba4f24f

            // 2. == 변수가 갖는 값/주소(위치) 비교 .equals() : 주소가 갖는 값 비교
        Object o9 = new BookDto();
        System.out.println( o9 ); // day20.BookDto@3b9a45b3
        Object o10 = new BookDto();
        System.out.println( o10 ); // day20.BookDto@7699a589
        Object o11 = o9;
        System.out.println( o9 == o10 );    // == 같다 , false
        System.out.println( o9.equals( o10 ) ); //   , false
        System.out.println( o9 == o11 ); // true
        System.out.println( o9.equals( o11 ) ); // true
        String str1 = new String("유재석");
        String str2 = new String("유재석");
        System.out.println( str1 == str2 ); // false
        System.out.println( str1.equals( str2 ) ); //true
            // 3. hashCode() : 객체의 주소(객체가 위치한 메모리위치)값을 정수로 반환
        System.out.println( str1.hashCode() );
        System.out.println( str2.hashCode() );
        System.out.println( o9.hashCode() );
        System.out.println( o10.hashCode() );
        System.out.println( o11.hashCode() );

        // [2] Class
        String str = new String();
        Class c = str.getClass();
        System.out.println( c ); // class java.lang.String
        Integer value = 3;
        Class c2 = value.getClass();
        System.out.println( c2 ); // class java.lang.Integer

        // 1. Class.forName("클래스경로"); :
        // 지정한 클래스경로에소 클래스를 로드/불러오기 메소드 *일반예외
        // -> 지정한 클래스경로에서 클래스를 로드 실패시 예외 발생
        try{ Class.forName("java.lang.String"); }
        catch ( ClassNotFoundException  e ) { }

        // 2.
        // .getFields() : 모든 클래스의 멤버변수명 반환
        // .constructors()  :
        // .getMethods()    :

        Field[] fields = c.getFields();
        for( int i = 0 ; i < fields.length ; i++ ){
        System.out.println( fields[i] ); }
        Constructor[] constructors = c.getConstructors();
        for( int i = 0 ; i < constructors.length ; i++ ){
            System.out.println( constructors[i] );
        }
        Method[] methods = c.getMethods();
        for( int i = 0 ; i < methods.length ; i++ ){
            System.out.println( methods[i] );
        }

        // [3]
        int value1 = 100;   // 자료 : 100 , 타입 : int
        Integer value2 = 100;   // 자료 : 100 , 타입 : Integer
        // 1. 언박싱과 오토박싱
        Integer value3 = value1;    // 오토박싱 : int -> Integer
        int value4 = value2;    // 언박싱 : Integer -> int
        // 2. ********** 문자열 --[ CSV/HTTP ]--> 기본타입 변환 **********
        int val1 = Integer.parseInt( "100" ); // "100" --> 100
        double val2 = Double.parseDouble( "3.14" ); // "3.14" --> 3.14
        float val3 = Float.parseFloat("3.14");
        byte val4 = Byte.parseByte( "100" );
        short val5 = Short.parseShort( "100" );
        long val6 = Long.parseLong( "100" );
        boolean val7 = Boolean.getBoolean( "true" );
        // 기본타입 -- > 문자열 변환
        String s1 = 100+""; // 방법1] 자료+"" , 값+문자열 --> 문자열 / 공백을 두지 않는다
        String s2 = String.valueOf( 100 ); // 방법2] String.valueOf( 자료 );

        // [4]
        // 1. 현재 날짜와 시간 생성
        LocalDate localDate = LocalDate.now(); // now는 static함수라서 new를 안쓴다
        System.out.println( localDate ); // 2025-07-25
        LocalTime localTime = LocalTime.now();
        System.out.println( localTime ); // 11:36:57.713549500
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println( localDateTime ); // 2025-07-25T11:37:52.445211300
        // 2. 지정한 날짜/시간 생성 , of( 년 , 월 , 일 , 시 , 분 , 초 );
        LocalDateTime.of( 2025, 07, 25 , 11 , 30 , 15 );
        // 3. 날짜/사간 형식 변경
            // 패턴 : y연도 , M월 , d일 , h시 ,m분 s초
            // 날짜.시간객체.format( 형식객체 ) : 지정한 형식으로 변환된 문자열 반환
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss");
        String today = localDateTime.format( formatter );
        System.out.println( today ); // 2025년 07월 25일 11:49:42

        // 4. 날짜 세부 정보
        int year = localDateTime.getYear(); // 연도
        int month = localDateTime.getMonthValue(); // 월
        int day = localDateTime.getDayOfMonth(); // 일
        int hour = localDateTime.getHour(); // 시
        int minute = localDateTime.getMinute(); // 분
        int second = localDateTime.getSecond(); // 초

        // 5. 날짜 계산
        LocalDateTime plusDateTime = localDateTime.plusDays( 10 );
        System.out.println( plusDateTime ); //2025-08-04T11:48:43.458150200
        LocalDateTime minusDateTime = localDateTime.minusDays( 30 );
        System.out.println( minusDateTime ); // 2025-06-25T11:50:42.018533900

    }//main e
}//class e
