package day15;

// [1]
interface Soundable{
    // 인터페이스 주요 멤버 : 상수 , 추상메소드 : 구현부{} 없는 메소드
    void makeSound();
}
class Cat implements Soundable{
    // 오버라이딩 자동완성 :
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
        new Cat().makeSound();
        Soundable sound = new Dog(); sound.makeSound();

        // [2]
        System.out.println( RemoteControl.MAX_VOLUME );
        System.out.println( RemoteControl.MIN_VOLUME );


    }// main e
} // class e
