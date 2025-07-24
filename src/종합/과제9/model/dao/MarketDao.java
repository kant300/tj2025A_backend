package 종합.과제9.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;


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
        } catch ( Exception e) {
            System.out.println( e );

        }
    }


}//class e
