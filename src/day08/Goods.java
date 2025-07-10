package day08;

public class Goods {
    // 1.멤버변수의 초기화
    String name ;
    int price = 0;
    // 2. 생성자
    // 2-1. 기본생성자
    Goods() {
        name = "미정";
        price = 0;
    }
    // 2-2. 매개변수가 있는 생성자
        Goods( String name , int price ){
        //매개변수와 멤버변수 이름이  같을 경우
        this.name = name;   // this.멤버변수
        this.price = price;
    }
    //메소드



}
