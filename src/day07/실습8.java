package day07;

public class 실습8 {
    public static void main(String[] args) {
        // [1] 매개변수X 반환값X
        Printer printer1 = new Printer(); //
        printer1.printMessage();//객체내 메소드 호출

        // [2] 매개변수 O, 반환값 X
        Greeter greet1 = new Greeter(); // 객체생성
        greet1.greet( "유재석" );
        // "유재석" : 인수/인자값은 메소드의 매개변수에 대입된다.
        // *** 인수/인자 값의 타입과 매개변수타입은 일치 ***


        // [3] 매개변수 O, 반환값 O
        SimpleCalculator cal1 = new SimpleCalculator();
        int result3 = cal1.add( 3 , 5 ); // 인자/인수값 : 3 , 5
        // int : .add() 메소드가 int타입으로 값을 반환했기 때문에
        System.out.println( result3 );

        // [4]
        Checker check1 = new Checker(); // 객체생성
        // check1.isEven( 3.14 );   // 오류발생!!
        boolean result4 = check1.isEven( 3 );
        System.out.println( result4 );  // false

        // [5]
        Lamp lamp1 = new Lamp();    // 객체생성
        lamp1.turnOn(); //true
        lamp1.turnOff(); // false

        // [6]
        Product prod1 = new Product();
        boolean result6 = prod1.sell( 5 );
        System.out.println( result6 );  // true






    }
}
