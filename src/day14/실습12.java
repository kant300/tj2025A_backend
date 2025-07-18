package day14;

class Person{ // Person 클래스
    String name;  //name(문자열) 멤버 변수
    public Person(String name){
        this.name = name;
        System.out.println("[Person 인스턴스생성]"); }// 생성자
    void showValue(){
        System.out.println(">>Person 메소드 실행<<");
    }

}
class Student extends Person{ //Person 클래스를 상속받는 Student 클래스
    int studentId; //studentId(정수) 멤버 변수
    Student()
    { System.out.println("[Student  인스턴스생성]"); }
    void showValue2() { System.out.println(">>Student 메소드 실행<<"); }

}

public class 실습12 {
    public static void main(String[] args) {
        Student student = new Student(); //  Student 객체를 생성

    }//main e
}// class e
