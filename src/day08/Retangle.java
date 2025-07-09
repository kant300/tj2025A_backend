package day08;

public class Retangle {
    // 멤버변수
    int width; // 가로
    int height; // 세로
    // 생성자 : width와 height를 매개변수로 받아
    Retangle( int width , int height ) {
        //초기화하는 생성자
        this.width = width;
        this.height = height;
    }
    // 메소드 :
    // 1. 메소드명: getArea
    // 2. 매개변수 : x
    // 3. 반환값 : 곱하기 계산결과 , int result;
    int getArea() {
        // 멤버변수( getArea() 메소드를 호출한 객체내 ) 끼리 계산
        int result = width * height;
        // 결과반환
        return result;
    }// func e


}// class e
