package 종합.예제8.model.dao;

import 종합.예제8.controller.BoardController;
import 종합.예제8.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardDao {
    // 1) 싱글톤
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return instance;
    }
    // 2) 여러개 게시물(DTO)들을 저장할 리스트 선언
    private ArrayList< BoardDto > boardDB = new ArrayList<>();

    // 3) 게시물등록 addBoard(){}
    public boolean addBoard( String content, String writer ) {
        boolean result = false;
        // ~~~기능구현
        // 3-1)매개변수 값들을 객체화히기
        BoardDto boardDto = new BoardDto( content , writer );
        // 3-2)리스트(DB)에 생성한 객체 대입하기
        boardDB.add( boardDto );
        // 3-3)성공시 result 에 성공의 의미 'true' 대입
        return  true;
    }

    // 4) 전체조회 기능 구현
    public ArrayList< BoardDto > getBoardList() {
        return boardDB;
    }

}//class e
