package day09;

public class BankAccount {
// 1. 멤버변수
    private String accountNumber;
// 2. 생성자
// * 오른쪽 클릭 -> [생성] -> [생성자]
    public BankAccount( String accountNumber ) {
        this.accountNumber = accountNumber;
    }
    //AccountNumber num = new AccounNumber;

// 3. 메소드
    // 3-1 getter 메소드
    public String getAccountNumber(){
        return this.accountNumber;
    }

}
