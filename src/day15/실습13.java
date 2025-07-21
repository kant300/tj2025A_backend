package day15;

// [1]
interface Soundable{ // 인터페이스 주요 멤버 : 상수,  추상메소드 : 구현부{} 없는 메소드
    // 인터페이스 주요 멤버 : 상수 , 추상메소드 : 구현부{} 없는 메소드
    public abstract void makeSound();   // public abstract 생략 가능
}
class Cat implements Soundable{
    // 오버라이딩 자동완성 : 클래스 안에서 컨트롤+스페이바 -> 방향키 위로 -> 선택후 엔터
    @Override
    public void makeSound() { System.out.println("야옹"); }
}
class Dog implements Soundable{
    // @Override
    public void makeSound() { System.out.println("멍멍"); }
}

// [2] 인터페이스 상수 : 프로그램내 고정값( static : 객체없이 사용하는 [정적]변수 ) ( final : 초기화 이후 수정 불가능 )
interface RemoteControl{
    public static final int MAX_VOLUME = 10;
    int MIN_VOLUME = 0; //public static final 생략가능
}

public class 실습13 {
    public static void main(String[] args) {
        // [1]
        new Cat().makeSound();   // 야옹
        Soundable sound = new Dog(); sound.makeSound(); // 멍멍

        // [2]
        System.out.println( RemoteControl.MAX_VOLUME ); // 10
        System.out.println( RemoteControl.MIN_VOLUME ); // 0


    }// main e
} // class e
