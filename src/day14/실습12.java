package day14;

// [1]
class Person{ // Person 클래스
    // 1. 클래스의 멤버 : 멤버변수 = 특징/상태 , 생성자 = 초기화 , 메소드 = 행동/이벤트
    String name; // name(문자열) 멤버 변수
    public Person() {
        System.out.println("[Person 인스턴스생성]");
    }
    void showValue() {
        System.out.println(">>Person 메소드 실행<<");
    }
}// class e

class Student extends Person{ // Person 클래스를 상속받는 Student 클래스
    int studentId; //studentId(정수) 멤버 변수
    public Student() {
        System.out.println("[Student 인스턴스생성]");
    }
    void showValue2() {
        System.out.println(">>Student 메소드 실행<<");
    }
}// class e

// [2]
class Animal{ //  Animal 클래스
    public void makeSound() { // makeSound() 메소드를 가진, 오버라이딩조건 : 부모타입의 메소드명이 선언부를 동일하면 된다.
        System.out.println("동물이 소리를 냅니다.");
    }// func e
}// class e

class Cat extends Animal{ // Animal을 상속받고 , Cat 클래스
    @Override
    public void makeSound() {
       System.out.println("고양이가 야옹하고 웁니다.");
   }
} // class e

// [3]
class Machine{  // Machine 클래스
    Machine() {
        System.out.println("부모 클래스 생성자 실행");
    }
}//class e

class Computer extends Machine{ // Machine을 상속받고 , Computer 클래스
    Computer() {
        System.out.println("자식 클래스 생성자 실행");
    }
}// class e

// [4]
class Figure{ // Figure 클래스
    public Figure(){
        System.out.println("[Figure 인스턴스 생성]");
    }
}// class e
class Triangle extends Figure{ // Figure를 상속받는 Triangle 클래스
    public Triangle() {
        System.out.println("[Triangle 인스턴스 생성]");
    }
}// class e

// [5]
class Shape{    // Shape 클래스
    public void draw() {
        System.out.println("도형을 그립니다.");
    }
}// class e
class Circle extends Shape{ // Shape을 상속받고 , Circle 클래스
    public void draw() {
        System.out.println("원을 그립니다.");
    }
}// class e

// [6]
class Vehicle{

}// class e
class Bus extends Vehicle{
    public void checkFare() {
        System.out.println("요금을 확인합니다.");
    }
}// class e

// [7]
class Beverage{ // Beverage 클래스
    public void drink() {
        System.out.println("음료를 마십니다.");
    }
}// class e

class Coke extends Beverage {
    @Override
    public void drink() {
        System.out.println("콜라를 마십니다.");
    }
}// class e

class Coffee extends Beverage {
    @Override
    public void drink() {
        System.out.println("커피를 마십니다.");
    }
} // class e

// [8]
class Weapon{
    public void attack() {
        System.out.println( "무기로 공격합니다.");
    }
}// class e
class Sword extends Weapon{
    @Override
    public void attack() {
        System.out.println("검으로 공격합니다.");
    }
}//class e
class Gun extends Weapon{
    @Override
    public void attack() {
        System.out.println("총으로 공격합니다.");
    }
}//class e
class Character{
    public void use(Weapon weapon) {
        weapon.attack();
    }
}

// [9]
class SuperClass{
    // 필드 (멤버 변수)
    String name = "상위";  // 'name' 필드를 "상위"로 초기화
    public void method() { // 메소드 (멤버 함수)
        System.out.println("상위 메소드");
    }
}// class e
class SubClass extends SuperClass{
    // 필드 (멤버 변수)
    String name = "하위"; // 'name' 필드를 "하위"로 초기화 (새로운 필드 정의)
    @Override
    public void method() {
        System.out.println("하위 메소드");
    }
}// class e

// [10]
class Device{  // Object -> Device

} //class e
class Electronic extends Device{ // Object -> Device -> Electronic

}// class e
class Laptop extends Electronic{ // Object -> Device -> Electronic -> Laptop

}// class e

public class 실습12 {
    public static void main(String[] args) {
        // [1] 기본 상속
        Student student = new Student(); //  Student 객체를 생성
        // Student student : 변수 , new Student(); 인스턴스/객체 생성
        student.name = "윤남노"; // 부모의 멤버변수 , 상속받은 name 멤버 변수에 이름저장
        student.studentId = 20250717; // 본인의 멤버변수 , 자신의 studentId 멤버 변수에 학번저장
        System.out.printf("이름 : %s \n" , student.name );
        System.out.printf("학번 : %d \n" , student.studentId);

        // [2] 메소드 오버라이딩 (Method Overriding)
        Cat cat = new Cat(); // Cat 객체를 생성
        cat.makeSound();// makeSound() 메소드를 호출

        // [3]  생성자 호출 순서
        Computer computer = new Computer(); // 객체생성
        System.out.println("Computer 생성자 실행");

        // [4] 다형성: 자동 타입 변환 (Upcasting)
        Triangle triangle = new Triangle(); // Triangle 객체를 생성
        Figure figure = triangle; // Triangle 객체를 Figure 타입의 변수에 저장
        // 자식클래스 Triangle 은 부모클래스 Figure로부터 상속받아 부모클래스의 특성을 포함하기 때문

        // [5] 다형성과 오버라이딩
        Shape shape = new Circle(); // 자동타입변환
        shape.draw(); // 원을 그립니다.
        // 현재 객체가 Circle로 바뀌어서

        // [6] instanceof와 강제 타입 변환 (Downcasting)
        Vehicle vehicle = new Bus();
        if( vehicle instanceof Bus ) { // instanceof 연산자를 사용하여 vehicle 변수가 Bus 타입인지 확인
            Bus bus = (Bus) vehicle; //  만약 Bus 타입이 맞다면, Bus 타입으로 강제 변환(Downcasting)
            bus.checkFare();
        }

        // [7] 다형성을 활용한 객체 배열
        Beverage[] beverages = new Beverage[ 2 ]; // 2개의 Beverage 객체를 담을 수 있는 배열 생성
        beverages[0] = new Coke(); // 배열 첫 번째 칸에 Coke 객체 저장
        beverages[1] = new Coffee(); // // 배열 두 번째 칸에 Coffee 객체 저장
        for( int i = 0 ; i <= beverages.length -1 ; i++ ) {
            beverages[i].drink(); //배열의 모든 요소를 꺼내 drink() 메소드를 호출
        }

        // [8] 다형성을 활용한 매개변수
        Weapon sword = new Sword(); //Sword 객체
        Weapon gun = new Gun(); //Gun 객체
        sword.attack();
        gun.attack();

        // [9] 필드와 메소드의 오버라이딩 차이
        SuperClass obj = new SubClass(); // 객체생성
        // obj 변수는 SuperClass 타입이지만, 실제로는 SubClass 객체를 참조
        System.out.println(obj.name); // SuperClass 타입의 name필드에 접근
        obj.method(); // 실제로 가리키는 SubClass객체를 참조해서

        // [10] 다중 상속 관계
        Laptop laptop = new Laptop();
        if ( laptop instanceof Electronic ) {
            System.out.println("Laptop은 Electronic 타입으로 형 변환이 가능하다. " );
        }
        if ( laptop instanceof Device ) {
            System.out.println("Laptop은 Device 타입으로 형 변환이 가능하다. " );
        }

    }//main e
}// class e
