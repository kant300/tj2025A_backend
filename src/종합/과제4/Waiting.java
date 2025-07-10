package 종합.과제4;

// (1) 데이터 모델  (Model - 캡슐화)
public class Waiting {
// 1. 멤버변수
    private String phone;
    private  int count;
// 2. 생성자
    // 2-1. 기본생성자
    public Waiting(){}
    // 2-2. 전체매객변수를 갖는 생성자
    public Waiting( String phone , int count ) {
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
        return "Waiting{" +
                "phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }
} // class e
