package 종합.예제8.model.dto;

public class BoardDto {
    // 1. 멤버변수 : 데이터 모델링의 속성참고, private
    private String content; //내용
    private String writer;  // 작성자
    // 기본생성자와 매개변수 전체생성자, getter and setter, toString 기본적으로 구성
    public BoardDto() { }// 기본생성자
    public BoardDto(String content, String writer) { //전체생성자
        this.content = content;
        this.writer = writer;
    }

    //getter and setter
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
    //toString
    @Override
    public String toString() {
        return "BoardDto{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }


}// class e
