package 종합.예제9.model.dto; // 데이터의 정보를 주로 담고 있다.

public class BoardDto {
    // 1. 멤버변수
    private String content;
    private String writer;

    // 2. 생성자, setter/getter , toString
    public BoardDto() { }
    public BoardDto(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
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
    @Override
    public String toString() {
        return "BoardDto{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}// class e
