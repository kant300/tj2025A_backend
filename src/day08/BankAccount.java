package day08;

public class BankAccount {
    //멤버변수
    String accountNumber;  // 계좌번호
    String ownerName;  // 예금주
    int balance;    // 잔고 (21억 이하잔고 만 가능)
    // 생성자
    BankAccount( String accountNumber , String ownerName , int balance ) {
        //초기화하는 생성자
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    // 메소드
    // 1) 입금 : 잔액을 입금액 더한다.
    // 1. 메소드명: deposit
    // 2. 매개변수 : 입금액    int money
    // 3. 반환값 : 잔액 = int vs 성공/실패 = boolean
    boolean deposit( int money ) {
        balance += money;   // 입금잔액에 입금액을 누적 더하기 한다.
        return true; // 실패가 없다는 가정하에 true이면 성공 의미부여해서 반환한다.
    }
    // 2) 출금 : 잔액에서 출금액 뺀다
    // 1. 메소드명: withdraw
    // 2. 매개변수 : 출금액    int money
    // 3. 반환값 : 잔액 = int vs 성공/실패 = boolean
   int withdraw( int money ) {
        balance -= money;   // 입금잔액에 입금액을 누적 빼기 한다.
        return balance; // 계산후 입금잔액을 반환한다.
   }

}
