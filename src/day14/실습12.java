package day14;

// [1]
class Person{ // Person 클래스
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
    public void makeSound() { // makeSound() 메소드를 가진
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

public class 실습12 {
    public static void main(String[] args) {
        // [1] 기본 상속
        Student student = new Student(); //  Student 객체를 생성
        student.name = "윤남노"; //상속받은 name 멤버 변수에 이름저장
        student.studentId = 20250717; // 자신의 studentId 멤버 변수에 학번저장
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
        Shape shape = new Circle();
        shape.draw(); // 원을 그립니다.
        // 현재 객체가 Circle로 바뀌어서







    }//main e
}// class e
