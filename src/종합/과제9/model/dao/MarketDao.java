package 종합.과제9.model.dao;
/*
import 종합.과제9.model.dto.MarketDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MarketDao {
    // (*)싱글톤
    private MarketDao(){ connect(); }
    private static final MarketDao instance = new MarketDao();
    public static MarketDao getInstance(){
        return instance;
    }
    // DB 연동
    private String db_url = "jdbc:mysql://localhost:3306/list9";
    private String db_user = "root";
    private String db_password = "1234";
    private Connection conn;

    private void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db_url, db_user, db_password);
            //System.out.println("연동 성공");
        } catch ( Exception e) { System.out.println( e ); }
    }

    // (1) 등록 기능 구현
    public boolean marketWrite( MarketDto marketDto ) {
        // boolean  : 해당 메소드 실행 결과를 true(저장성공) false(저장실패) 반환하기 위한 타입
        // MarketDto marketDto  : controller로부터 저장할 값들을 dto로 구성해서 받는 매개변수
        try{
            // 1. SQL 작성한다.
            String sql = "insert into market( puser , pname , pcontent , pprice , ppwd ) values ( ? , ? , ? , ? , ? )";
            // 2. SQL 기재한다.
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 매개변수 대입 , 현재 ? 5개
            ps.setString( 1 , marketDto.getPuser() );
            ps.setString( 2 , marketDto.getPname() );
            ps.setString( 3 , marketDto.getPcontent() );
            ps.setInt( 4 , marketDto.getPprice() );
            ps.setString( 5 , marketDto.getPpwd() );
            // 4. SQL 실행 , insert/update/delete 은 .executeUpdate();
            int count = ps.executeUpdate();
            // 5. SQL 결과에 따른 로직/리턴/확인
            if ( count >= 1 ) return  true; // 1개이상 insert했으면 저장성공
        }catch ( Exception e ){ System.out.println(e); }
        return false; // 예외 발생시 저장 실패
    } // func e

    //  // (2) 전체조회 기능 구현
    public ArrayList<MarketDto> MarketPrint() {
        // ArrayList<MarketDto> : *배열* 대신에 다양한 편의성 기능을 제공하는 ArrayList 클래스
        ArrayList<MarketDto> list = new ArrayList<>(); // 조회된 레코드(DTO) 들을 저장할 리스트 선언
        try{
            // 1. SQL 작성한다.
            String sql = "select * from market";
            // 2. SQL 기재한다.
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 매개변수 대입 , SQL 문법에? (매개변수) 가 없어서 생략
            // 4. SQL 실행 , insert/update/delete 은 .executeUpdate();
            ResultSet rs = ps.executeQuery();
            // 5. SQL 결과에 따른 로직/리턴/확인
            // 1) select 조회결과를 레코드/행/가로단위 하나씩 조회
            while ( rs.next() ){ //rs.next() : ResultSEt 인터페이스가 갖는 (조회)(결과 테이블에서 다음 레코드 이동 뜻
                int pno = rs.getInt( "pno" ); // rs.get타입("가져올속성명 or 번호")
                String pname = rs.getString( "pname" );
                int pprice = rs.getInt( "pprice" );
                String puser = rs.getString( "puser" );
               // Pdate pdate = rs.getDate( "pdate" );
                //boolean psale = rs.getPsale( true );
                //MarketDto marketDto = new MarketDto( pno , pname, pprice , puser , pdate ,true );
                // 레코드1개(열6걔 --> DTO(멤버변수6개) 1개
                // 3) 생성된 dto를 리스트에 담아주기
               // list.add( marketDto );
            }// while e
        }catch ( Exception e ){ System.out.println(e); }
        return list;
    }// func e


}//class e
*/