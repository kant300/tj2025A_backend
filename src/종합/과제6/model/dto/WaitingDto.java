package 종합.과제6.model.dto;

public class WaitingDto {
    // 1. 멤버변수 : 데이터 모델링의 속성 참고, private
    private String phone;   //전화번호
    private int count;  // 인원수
    // 2. 생성자(기본/전체)
    public WaitingDto() { }
    public WaitingDto(String phone, int count) {
        this.phone = phone;
        this.count = count;
    }
    // 3. 메소드
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
}// class e
