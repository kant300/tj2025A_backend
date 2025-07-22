package 종합.과제7.model.dao;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import 종합.과제7.model.dto.WaitingDto;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WaitingDao {
    // (*)싱글톤
    private WaitingDao(){
        openCSV();
    }
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }
    // (*) DB 대신할 리스트 선언 < 추후에 사용하지 않음 >
    ArrayList<WaitingDto> waitingDB = new ArrayList<>();

    // (1) 등록
    public boolean waitingWrite( WaitingDto waitingDto ){
        waitingDB.add(waitingDto); // 1. 리스트(DB)에 DTO를 저장한다.
        saveCSV();  // * CSV 저장
        return true;    // 2. 성공시 true 반환한다.
    }// func e

    // (2) 전체조회
    public ArrayList<WaitingDto> waitingPrint() {
        // ArrayList<WaitingDto> : 반환타입으로 모든 dto를 반환환다.
        return waitingDB; // waitingDB변수의 타입은 ArrayList<waitngDto> 이다.
    }

    // (*) CSV 파일 경로 지정한다.
    private String path = "src/종합/과제7/data.csv";
    // ------------------------- 1. CSV 파일 연동 함수 ------------------------------
    public void openCSV() {
        File file = new File( path );  //(1) 파일 객체 생성한다. .exists() 지정한 경로에 파일 존재여부 반환함수
        if( file.exists() ) {  // (2) 만약에 파일이 존재하면 정보 불러오기
            loadCSV();
        }else{  // (2) 아니면 파일생성 .createNewFile() 지정한 경로에 파일 생성함수
            try { file.createNewFile(); // 파일생성 , 예외처리 한다.
            } catch (IOException e) { System.out.println(e); }
        }
    }// func e

    // ------------------------- 2. CSV 입력(호출) 함수 ------------------------------
    public void loadCSV() {
        try{
            FileReader fileReader = new FileReader( path );// (1) FileReader 이용한 읽기모드 객체 생성
            CSVReader csvReader = new CSVReader( fileReader );// (2) CSVReader 에 fileReader대입하여 CSV객체 생성
            List<String[]> inData = csvReader.readAll(); // (3) .readAl() 함수로 모든 CSV정보를 읽어온다.
            for( String[] row : inData ) {// 향상된 for 문     (4) 반복문  이용한 행 순회
                String phone = row[0]; // 첫번째 열
                int count = Integer.parseInt(row[1]);// 두번째 열
                WaitingDto waitingDto = new WaitingDto( phone , count );  // (5) 각 열들을 하나의 dto로 생성
                waitingDB.add( waitingDto ); // (6) 생성된 dto를 리스트에 저장
            }
            // (7) csvReader 안전하게 닫기( 메모리 누수 방지 ) : 파일 (용량크다) 객체는 자동 초기화 보다 직접 초기화 안전
            csvReader.close();
        }catch ( Exception e )  { System.out.println( e ); }
    }

    // ------------------------- 1. CSV 출력(저장) 함수 ------------------------------
    public void saveCSV() {
        try{
            FileWriter fileWriter = new FileWriter( path ); // (1) FileWriter 파일 쓰기모드 객체 생성
            CSVWriter csvWriter = new CSVWriter( fileWriter ); // (2) CSVWriter 에 fileWriter 객체를 대입하여 생성
            List<String[]> outData = new ArrayList<>();// (3) 빈 리스트 생성
            // ArrayList(구현체) , List(인터페이스)
            for( WaitingDto waitingDto : waitingDB ) { // (4) 현재 모든 정보( boardDB) 를 outData에 담아준다.
                // (5) dto 하나씩 내용과 작성자를 배열으로 구성
                String[] row = { waitingDto.getPhone() , String.valueOf( waitingDto.getCount() ) };
                outData.add( row );// (6) outData에 저장한다.
            }
            csvWriter.writeAll( outData );// (7) 최종적으로 outData를 csv내보내기 한다.
            csvWriter.close(); //(8) 안전하게 객체 닫기
        }catch ( Exception e ) {  System.out.println( e ); }



    }



    // (2) 전체조회

}// class e
