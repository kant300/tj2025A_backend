package 종합.과제5.model.dto;

public class WaitingDto {
    // (5) 멤버변수 : 설계기반으로 구성한 속성
    private String phone;
    private int count;
    // (6) 기본 생성자, 전체생성자 자동생성
    public WaitingDto() {}
    public WaitingDto( String phone , int count ) {
        this.phone = phone;
        this.count = count;
    }
    // (7) 메소드 자동생성

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WaitingDto{" +
                "phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }
}
