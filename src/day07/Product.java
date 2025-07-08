package day07;

// [6]
public class Product {
    String name;
    int stock = 10 ;  // 멤버변수의 초기화
    //메소드
    boolean sell( int 구매수량 ) {
        if( stock >= 구매수량 ){
            stock -= 구매수량;
            System.out.println( "남은 재고: " + stock );
            return true;
        }else{
            System.out.println("재고 부족");
            return false;
        } //if e
   } // func e

}
