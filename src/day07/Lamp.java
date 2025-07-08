package day07;

// [5]
public class Lamp {
    // 멤버변수
    boolean isOn;
    // 메소드
    void turnOn() {
        isOn = true;
        System.out.println( isOn );
    } //func e

    void turnOff() {
        isOn = false;
        System.out.println( isOn );
    } // func e
}
